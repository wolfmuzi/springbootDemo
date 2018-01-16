package com.ivg.demo.dto;

/**
 * @ClassName: StoreQueryDto
 * @Description: 入库单模块查询条件类
 * @author: lijin
 * @date: 2017年9月27日  下午4:29:54
 */
public class StoreQueryDto {
    //门店/仓库编号
    private String warehouseCode;

    //查询入库单还收货单,B01配货单，S01入库单
    private String type;

    //单据状态："-1"未收货，"0"部分收货，"1"已收货'
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }


}
