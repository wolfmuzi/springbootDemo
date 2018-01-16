package com.ivg.common.model;

public interface DreamStatus {

    String SUCCESS = "SUCCESS";

    String FAIL = "FAIL";

    String CREATED = "CREATED";

    String WX = "WX";

    String AL = "AL";

    interface BlackListStatus {
        String Filter = "filter";

        String UnFilter = "unFilter";
    }

    interface CheckStatus {
        String Normal = "Normal";

        String Invalid = "Invalid";
    }

    interface LoginSafeCodeStatus {
        String Normal = "Normal";

        String Invalid = "Invalid";
    }

    interface OnLineAuthStatus {
        String Normal = "Normal";

        String Invalid = "Invalid";
    }

    interface SupplierStatus {
        String Normal = "Normal";

        String Pause = "Pause";

        String Stop = "Stop";
    }

    interface InBillStatus {
        String DRAFT = "draft";

        String COMMIT = "commit";

        String VERIFY = "verify";

        String INSTORAGE = "inStorage";

        String SHELF = "shelf";

        String CLOSE = "close";
    }


    interface ReplenishmentBillStatus {
        String CREATE = "create";

        String COMMIT = "commit";

        String VERIFY = "verify";

        String CLOSE = "close";

    }

    interface OutBillStatus {
        String PREOUT = "preout";

        String PICKING = "picking";

        String PART_COMPLETE = "partComplete";

        String COMPLETE = "complete";

    }

    interface ReceiveBillStatus {
        String CREATE = "create";

        String CLOSE = "close";
    }

    interface WarehouseStatus {
        String NORMAL = "Normal";

        String INVALID = "Invalid";
    }

    interface StorageZoneStatus {
        String NORMAL = "Normal";

        String INVALID = "Invalid";
    }

    interface StorageLocationStatus {
        String NORMAL = "Normal";

        String INVALID = "Invalid";
    }

    interface PalletStatus {
        String NORMAL = "Normal";

        String INVALID = "Invalid";
    }

    interface InventoryPlanBillStatus {
        String WAITING = "Waiting";

        String WORKING = "Working";

        String COMPLETE = "Complete";
    }

    interface PrintItemStatus {
        String PRINTED = "PRINTED";
        String UNPRINT = "UNPRINT";
    }

}
