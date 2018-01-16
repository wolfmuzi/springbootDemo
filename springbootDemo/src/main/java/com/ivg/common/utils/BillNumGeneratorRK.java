package com.ivg.common.utils;//package invengo.com.common.utils;
//
//import ivg.ivg.demo.type.BillType;
//import ivg.ivg.common.model.entity.BillNum;
//import ivg.ivg.common.model.mapper.ex.BillNumExMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//
//@Service
//public class BillNumGeneratorRK {
//    private final SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//    @Autowired
//    private BillNumExMapper billNumExMapper;
//
//    @Transactional
//    public synchronized String generateBillNum(String billType, Long userId, Long clientId, String receiverCode) {
//        String prexNum = getcurrentPrexNum(billType, receiverCode);
//
//        BillNum bNumRecord = new BillNum();
//        bNumRecord.setClientId(clientId);
//        bNumRecord.setBillType(billType);
//        bNumRecord.setPrexNum(prexNum);
//        BillNum bNum = billNumExMapper.selectByParam(bNumRecord);
//
//        if (bNum == null) {
//            bNumRecord.setFlowNum(0);
//            //attr01为员工编码
//            bNumRecord.setCreater(userId);
//            bNumRecord.setName(BillType.billNameMap.get(billType));
//            billNumExMapper.insertSelective(bNumRecord);
//            return generateBillNum(bNumRecord);
//        }
//
//        return generateBillNum(bNum);
//    }
//
//    private String generateBillNum(BillNum bNumRecord) {
//        bNumRecord.setLastUpdate(new Date());
//        bNumRecord.setFlowNum(bNumRecord.getFlowNum() + 1);
//        billNumExMapper.updateByPrimaryKeySelective(bNumRecord);
//
//        return bNumRecord.getPrexNum() + String.format("%04d", bNumRecord.getFlowNum());
//    }
//
//    private String getcurrentPrexNum(String billType, String receiverCode) {
//        return BillType.billNumPrexMap.get(billType) + receiverCode + sdf.format(Calendar.getInstance().getTime()) + "-";
//    }
//}
