package com.ivg.demo.mapper.fixed;

import com.ivg.demo.model.entity.fixed.StoreInBill;

public interface StoreInBillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StoreInBill record);

    int insertSelective(StoreInBill record);

    StoreInBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StoreInBill record);

    int updateByPrimaryKey(StoreInBill record);
}