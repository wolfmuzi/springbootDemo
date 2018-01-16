package com.ivg.demo.service;


import com.ivg.demo.model.entity.ex.StoreInBillEx;

import java.util.List;

public interface StoreInBillExService {
    List<StoreInBillEx> findInBillAll();

    List<StoreInBillEx> getInBillBySupplierCode(String supplierCode);
}
