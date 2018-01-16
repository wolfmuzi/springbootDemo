package com.ivg.demo.service.impl;

import com.ivg.comp.redis.RedisCacheServiceImpl;
import com.ivg.demo.mapper.ex.StoreInBillExMapper;
import com.ivg.demo.model.entity.ex.StoreInBillEx;
import com.ivg.demo.service.StoreInBillExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreInBillExServiceImpl implements StoreInBillExService {

    @Autowired
    private StoreInBillExMapper storeInBillExMapper;

    @Autowired
    private RedisCacheServiceImpl redisCacheService;
    @Override
    public List<StoreInBillEx> findInBillAll() {
            redisCacheService.set("test!!!!!!!!!!","helloworld");
        return storeInBillExMapper.findInBillAll();
    }

    @Override
    public List<StoreInBillEx> getInBillBySupplierCode(String supplierCode) {
        return storeInBillExMapper.getInBillBySupplierCode(supplierCode);
    }
}
