package com.ivg.demo.mapper.fixed;

import com.ivg.demo.model.entity.StoreOutBill;

public interface StoreOutBillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StoreOutBill record);

    int insertSelective(StoreOutBill record);

    StoreOutBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StoreOutBill record);

    int updateByPrimaryKey(StoreOutBill record);
}