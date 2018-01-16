package com.redis;

import com.alibaba.fastjson.JSON;
import com.ivg.demo.dto.StoreQueryDto;

/**
 * @author: lj
 * @description:
 * @date: 10:51 2018/1/16
 */
public class JsonTest {
    public static void main(String[] args){
        StoreQueryDto dto = new StoreQueryDto();
        dto.setStatus("true");
        dto.setType("test");
        dto.setWarehouseCode("001");
        System.out.println(JSON.toJSONString(dto));
    }
}
