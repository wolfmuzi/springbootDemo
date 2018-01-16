package com.ivg.common.model.mapper.fixed;


import com.ivg.common.model.entity.BillNum;

public interface BillNumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BillNum record);

    int insertSelective(BillNum record);

    BillNum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BillNum record);

    int updateByPrimaryKey(BillNum record);
}