package com.ivg.demo.type;

import java.util.HashMap;
import java.util.Map;

public interface BillType {

    String BAR_CODE_DATA_FLAG = "BAR_CODE_DATA_FLAG"; //从第三方获取数据开关

    String BS_FLAG = "BS_FLAG"; //从BS第三方获取数据开关

    String SC_FLAG = "SC_FLAG"; //从SC第三方获取数据开关

    String TAGBIND_FLAG = "TAGBIND_FLAG"; //从标签绑定开关

    String InBill = "In"; //入库单类型

    String OutBill = "Out"; // 出库单类型

    String ReturnBill = "returnBill"; //退货单

    String TransfersBill = "TransfersBill"; //调拨

    String InventoryPlanBill = "InventoryPlan"; // 盘点计划单类型

    String InventoryBill = "Inventory"; // 盘点单类型

    String InventoryDiffBill = "InventoryDiff"; // 盘点差异单类型

    String Sku = "Sku"; // sku流水号

    String PackageInventory = "packageInventory"; // 打包复查

    String InventoryTask = "InventoryTask"; // 盘点任务

    Map<String, String> billNameMap = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;

        {
            put("In", "入库单");
            put("Out", "出库单");
            put("InventoryPlan", "盘点计划单");
            put("Inventory", "盘点单");
            put("InventoryDiff", "盘点差异单");
            put("Sku", "sku流水号");
            put("packageInventory", "打包复查");
            put("InventoryTask", "盘点任务");
            put("ReturnBill", "退货单");
            put("TransfersBill", "调拨单");
        }
    };

    Map<String, String> billNumPrexMap = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;

        {
            put("In", "RK");
            put("Out", "CK");
            put("InventoryPlan", "PDJH");
            put("Inventory", "PD");
            put("InventoryDiff", "PDCY");
            put("Sku", "SKU");
            put("packageInventory", "PKG");
            put("InventoryTask", "PDRW");
            put("returnBill", "THD");
            put("TransfersBill", "HDDB");
        }
    };
}
