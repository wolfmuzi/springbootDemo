package com.ivg.demo.mapper.ex;

import com.ivg.demo.mapper.fixed.StoreInBillMapper;
import com.ivg.demo.model.entity.ex.StoreInBillEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StoreInBillExMapper extends StoreInBillMapper {

    List<StoreInBillEx> findInBillAll();

    List<StoreInBillEx> getInBillBySupplierCode(@Param(value = "supplierCode") String supplierCode);

}
