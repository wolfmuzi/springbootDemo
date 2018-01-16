package com.ivg.demo.type;

public interface BSType {
    String BSIN = "DB"; //入库单、配货单回传类型
    String BSOUT = "TB"; //出库单、退仓回传类型
    String BSINLC = "S01"; //出库单、退仓流程编号类型
    String BSOUTLC = "S02"; //出库单、退仓流程编号类型

    //打印状态 1 为已经打印，0为未打印
    String PRINT = "1";
    String UNPRINT = "0";

    //InBill:EpcList

    //状态 1 为开启，0为未开启
    String ENABLE = "1";
    String CLOSE = "0";


}
