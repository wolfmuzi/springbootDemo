package com.ivg.demo.model.entity.ex;

import com.ivg.demo.model.entity.fixed.StoreInBill;

import java.math.BigDecimal;

public class StoreInBillEx extends StoreInBill {

    private String model;

    private String containerNum;

    private BigDecimal receiveTotalPrice;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getContainerNum() {
        return containerNum;
    }

    public void setContainerNum(String containerNum) {
        this.containerNum = containerNum;
    }

    public BigDecimal getReceiveTotalPrice() {
        return receiveTotalPrice;
    }

    public void setReceiveTotalPrice(BigDecimal receiveTotalPrice) {
        this.receiveTotalPrice = receiveTotalPrice;
    }

    @Override
    public String toString() {
        return "StoreInBillEx{" +
                "model='" + model + '\'' +
                ", containerNum='" + containerNum + '\'' +
                ", receiveTotalPrice=" + receiveTotalPrice +
                '}';
    }
}
