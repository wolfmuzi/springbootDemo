package com.ivg.common.utils;

import com.ivg.common.model.entity.BillNum;
import com.ivg.common.model.mapper.ex.BillNumExMapper;
import com.ivg.demo.type.BillType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class BillNumGeneratorSC {
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
    //TODO
//    @Autowired
    private BillNumExMapper billNumExMapper;

    @Transactional
    public synchronized String generateBillNum(String billType, Long userId, Long clientId, String supplierCode) {
        String prexNum = getcurrentPrexNum(billType, supplierCode);

        BillNum bNumRecord = new BillNum();
        bNumRecord.setClientId(clientId);
        bNumRecord.setBillType(billType);
        bNumRecord.setPrexNum(prexNum);
        BillNum bNum = billNumExMapper.selectByParam(bNumRecord);

        if (bNum == null) {
            bNumRecord.setFlowNum(0);
            bNumRecord.setCreater(userId);
            bNumRecord.setName(BillType.billNameMap.get(billType));
            billNumExMapper.insertSelective(bNumRecord);
            return generateBillNum(bNumRecord);
        }

        return generateBillNum(bNum);
    }

    private String generateBillNum(BillNum bNumRecord) {
        bNumRecord.setLastUpdate(new Date());
        bNumRecord.setFlowNum(bNumRecord.getFlowNum() + 1);
        billNumExMapper.updateByPrimaryKeySelective(bNumRecord);

        return bNumRecord.getPrexNum() + String.format("%04d", bNumRecord.getFlowNum());
    }

    private String getcurrentPrexNum(String billType, String supplierCode) {
        return BillType.billNumPrexMap.get(billType) + supplierCode + sdf.format(Calendar.getInstance().getTime());
    }
}
