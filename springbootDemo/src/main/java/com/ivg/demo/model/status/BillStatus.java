package com.ivg.demo.model.status;

public interface BillStatus {

    interface CommonBillStatus {
        String Draft = "Draft"; // 草稿状态

        String Deleted = "Deleted"; // 已删除|已废弃

        String Created = "Created"; // 已提交|已创建

        String Audited = "Audited"; // 已审核

        String Closed = "Closed"; // 已关闭
    }

    interface InBillStatus {
        String Create = "Create";

        String Draft = "Draft";

        String Commit = "Commit";

        String VERIFY = "Verify";

        String In = "In";

        String Shelft = "Shelf";

        String CLOSE = "Close";

    }

    interface InventoryDiffBillStatus {
        String Adjusted = "Adjusted"; // 已调整
    }

}
