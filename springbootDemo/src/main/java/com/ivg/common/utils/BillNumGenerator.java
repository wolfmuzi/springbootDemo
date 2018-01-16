package com.ivg.common.utils;/*package invengo.com.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dream.biz.dao.ex.BillNumExMapper;
import com.dream.biz.model.entity.fixed.BillNum;
import com.dream.biz.model.type.BillType;

@Service
public class BillNumGenerator
{
  @Autowired
  private BillNumExMapper billNumExMapper;
  
  private final SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); 
  
  @Transactional
  public synchronized String generateBillNum(String billType, Long userId, Long clientId){
    String prexNum = getcurrentPrexNum(billType);
    
    BillNum bNumRecord = new BillNum();
    bNumRecord.setClientId(clientId);
    bNumRecord.setBillType(billType);
    bNumRecord.setPrexNum(prexNum);
    BillNum bNum = billNumExMapper.selectByParam(bNumRecord);
    
    if(bNum == null){
      bNumRecord.setFlowNum(0);
      bNumRecord.setCreater(userId);
      bNumRecord.setName(BillType.billNameMap.get(billType));
      billNumExMapper.insertSelective(bNumRecord);
      return generateBillNum(bNumRecord);
    }
    
    return generateBillNum(bNum);
  }
  @Transactional
  private String generateBillNum(BillNum bNumRecord)
  {
    bNumRecord.setLastUpdate(new Date());
    bNumRecord.setFlowNum(bNumRecord.getFlowNum() + 1);
    billNumExMapper.updateByPrimaryKeySelective(bNumRecord);
    
    return bNumRecord.getPrexNum() + String.format("%04d", bNumRecord.getFlowNum());
  }

  private String getcurrentPrexNum(String billType)
  {
    return BillType.billNumPrexMap.get(billType) + sdf.format( Calendar.getInstance().getTime())+ "-";
  }
}*/
