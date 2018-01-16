package com.ivg.demo.type;

public interface EntityType {
    interface InventoryPlanBillType {
        String Hidden = "Hidden";

        String Show = "Show";
    }

    interface InventoryBillType {
        String Hidden = "Hidden";

        String Show = "Show";
    }

    interface InventoryDiffBillType {
        String Handheld = "Handheld";
        String DiffAsset = "DiffAsset";
    }
}
