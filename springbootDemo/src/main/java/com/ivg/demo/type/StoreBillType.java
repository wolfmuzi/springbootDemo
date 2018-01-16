package com.ivg.demo.type;

import java.util.HashMap;
import java.util.Map;

public interface StoreBillType {

    String StoreInBill = "B01";    // 配货单
    String StoreStorage = "S01";    // 入库单
    String StoreOutBil = "B02";    // 退仓
    String storeOutBound = "S02";    // 出库单

    Long InBillSingle = 1l;        // 按单收货
    Long InBillBox = 0l;            // 按箱收货


    String NotReceiving = "-1";    // 未收货/未发货
    String PartOfTheGoods = "0";    // 部分收货/部分发货
    String HaveTheGoods = "1";        // 已收货/已发货


    String OutBillBarCodeCache = "OutBillBarCodeCache";    // 退仓单条码模式缓存
    String OutBillAllBarCodeCache = "OutBillAllBarCodeCache";  // 退仓单箱(商品)条码模式缓存
    String SUPPLIERS = "Suppliers";        // 退货供应商
    String RECEIVESHOP = "ReceiveShop";    // 门店缓存

    String OutBillCache = "outBillCache";    // 退仓单缓存
    String OutBillAllCache = "outBillCache";    // // 退仓单箱(商品)缓存

    String RemarkEpc = "RFID";            // 收货类型--RFID
    String RemarkBarCode = "非RFID";    // 收货类型--BARCODE

    String EPC = "RFID";                // 收货类型--RFID
    String BARCODE = "BARCODE";            // 收货类型--BARCODE

    String Shipped = "1";                // 已发货
    String Acceptance = "2";            // 已验收

    Map<String, String> StoreBillPrexMap = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;

        {
            put("StoreInBill", StoreInBill);
            put("StoreOutBill", StoreStorage);
            put("StoreOutBil", StoreOutBil);
            put("storeOutBound", storeOutBound);
        }
    };

    Map<String, Long> InBillReceivingWayMap = new HashMap<String, Long>() {
        private static final long serialVersionUID = 1L;

        {
            put("InBillSingle", InBillSingle);
            put("InBillBox", InBillBox);
        }
    };

    Map<String, String> ReceiveGoodsMap = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;

        {
            put("NotReceiving", NotReceiving);
            put("PartOfTheGoods", PartOfTheGoods);
            put("HaveTheGoods", HaveTheGoods);
        }
    };
}
