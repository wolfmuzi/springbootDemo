package com.ivg.demo.controller;

import com.alibaba.fastjson.JSON;
import com.ivg.comp.mq.RabbitMqSend;
import com.ivg.demo.dto.StoreQueryDto;
import com.ivg.demo.model.entity.ex.StoreInBillEx;
import com.ivg.demo.service.StoreInBillExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("inbill")
@Controller
public class InBillController {


    @Autowired
    private StoreInBillExService inBillExService;

    @Autowired
    private RabbitMqSend rabbitMqSend;

    @RequestMapping("findInBillAll")
    @ResponseBody
    public List<StoreInBillEx> findInBill() {
        return inBillExService.findInBillAll();
    }

    @RequestMapping("getInBill")
    @ResponseBody
    public List<StoreInBillEx> getInBillBySupplierCode(String supplierCode){
        return inBillExService.getInBillBySupplierCode(supplierCode);
    }

    @RequestMapping("sendMessage")
    @ResponseBody
    public String sendMessage(){
        StoreQueryDto dto = new StoreQueryDto();
        dto.setStatus("true");
        dto.setType("test");
        dto.setWarehouseCode("001");
        String string = JSON.toJSONString(dto);
        /*rabbitMqSend.sendMsg1(dto);
        rabbitMqSend.sendMsg2(dto);*/
        rabbitMqSend.sendMsg1(string);
        rabbitMqSend.sendMsg2(string+"test!!!!!!!!!!!!!");
        return "hellow rabbitmq!!!";
    }

}
