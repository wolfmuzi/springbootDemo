package com.ivg.demo.model.status;

public interface EntityStatus {
    String Normal = "Normal";

    String Disable = "Disable";

    interface StockStatus {
        String In = "In";

        String Out = "Out";

        String Borrow = "Borrow";

        String Sale = "Sale";

        String Destroy = "Destroy";
    }

    interface StoreReturnGoodsRebindStatus {
        String Bind = "bind";

        String Unbind = "unbind";
    }

    interface RetunGoodsTagBindStatus {
        String ReturnGoods = "0";

        String Others = "1";

    }

    interface JudeErp {

        String IsERP = "Erp";

        String Ibase = "Base";
    }


    interface AssetItemStatus {
        String Create = "Create";

        String In = "In";

        String Out = "Out";

        String Borrow = "Borrow";

        String Sale = "Sale";
    }

    interface TagAssetItemLocationStatus {
        String Normal = "Normal";

        String Shelf = "Shelf";
    }

    interface TagStatus {

        String USE = "USE";

        String UNUSE = "UNUSE";

    }

    interface InventoryPlanStatus {

        String CREATE = "Create";

        String Submit = "Submit";

        String Inventory = "Inventory";

    }

    interface TagAssetItemLocationAssoStatus {

        String Normal = "Normal";

        String Shelf = "Shelf";

        String Sale = "Sale";

    }

    interface InventoryTaskStatus {

        String Commit = "Commit";

        String Create = "Create";

        String Close = "Closed";

        String Rfid = "Rfid";

        String Barcode = "Barcode";

        String Destroy = "Destroy";

    }

    interface InventoryBillStatus {

        String Normal = "Normal";
        String Exception = "Exception Tag";

    }

    interface WarehouseStatus {
        String Shop = "SHOP";
        String Warehouse = "WAREHOUSE";
        String Normal = "Normal";
        String Invalid = "Invalid";
    }

    interface WarehouseClassifyStatus {
        String Shop = "门店库";
        String Warehouse = "仓库";
    }


    interface StoreOutBillStatus {
        String B02 = "B02";//退仓
        String S02 = "S02";//调度
        String unSend = "-1";//未发货 不用
        String sendHalf = "0";//部分发货 不用
        String Send = "1";//已发货
        String Checked = "2";//已验收
        String CazeCode = "XH";//箱号
        String Printed = "1";//已打印
        String UnPrinted = "0";//未打印
    }

    interface StoreInBillStatus {
        String B01 = "B01";//B01表示配货单
        String S01 = "S01";//S01表示入库单
        String unReceive = "-1";//未收货
        String receiveHalf = "0";//部分收货
        String Receive = "1";//已收货
        String itemUnreceive = "0";//未收货

    }
}
