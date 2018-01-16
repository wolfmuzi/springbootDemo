package com.ivg.common.model.mapper.ex;

import com.ivg.common.model.entity.BillNum;
import com.ivg.common.model.mapper.fixed.BillNumMapper;

public interface BillNumExMapper extends BillNumMapper {
    BillNum selectByParam(BillNum bNumRecord);
}