package com.ivg.demo.model.vo;

import java.util.List;

public class PrintBillDetailVO {

    private String barcode;

    private String productName;

    private String warehouseCode;

    private String warehouseName;

    private String billNo;

    private String specification;

    private String branchCode;

    private String inDate;

    private long qty;

    private long flowNum;

    private List<Object> epcVO;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public long getFlowNum() {
        return flowNum;
    }

    public void setFlowNum(long flowNum) {
        this.flowNum = flowNum;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public List<Object> getEpcVO() {
        return epcVO;
    }

    public void setEpcVO(List<Object> epcVO2) {
        this.epcVO = epcVO2;
    }


}
