package com.ivg.common.utils;/*package invengo.com.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import com.dream.biz.model.entity.ex.StockEx;
import com.dream.biz.model.entity.ex.store.pda.StoreInBillItemEx;
import com.dream.biz.model.entity.fixed.Stock;
import com.dream.biz.model.entity.fixed.store.StoreInBillItem;
import com.dream.biz.model.vo.store.StockExOutVo;

*//*
 * 入库、出库差异工具类
 *//*
public class BillItemUtils {

	*//*
     * 根据barcode进行分组
	 *//*
    public static Map<String, StoreInBillItemEx> groupByBarcode(List<StoreInBillItemEx> inBillItemExs){
		//List<StoreInBillItemEx> inBillExs=new ArrayList<StoreInBillItemEx>();
		Map<String, StoreInBillItemEx> groupMap=new HashMap<String,StoreInBillItemEx>();
		for (StoreInBillItemEx itemEx : inBillItemExs) {
			if(null == groupMap.get(itemEx.getBarcode())){
				StoreInBillItemEx item=new StoreInBillItemEx();
				BeanUtils.copyProperties(itemEx, item);
				List<StoreInBillItem> s=new ArrayList<StoreInBillItem>();
				s.add(itemEx);
				item.setBillItems(s);
				item.setPlanQty(1L);
				item.setQty(0L);
				//需要判断是否在库？
				groupMap.put(itemEx.getBarcode(),item);
			}
			else {
				StoreInBillItemEx items=groupMap.get(itemEx.getBarcode());
				items.getBillItems().add(itemEx);
				//是否会报空指针
				items.setPlanQty(items.getPlanQty()+1L);
				System.out.println(items.getPlanQty());
			}
		}
		*//*for(Entry<String, StoreInBillItemEx> entry:groupMap.entrySet()){
			StoreInBillItemEx item=entry.getValue();
			inBillExs.add(item);
		}*//*
		return groupMap;
	}
	
	*//*
	 * 根据barcode进行分组
	 *//*
	public static Map<String, StockExOutVo> groupByBar(List<StockEx> stockList){
		Map<String, StockExOutVo> groupMap=new HashMap<String,StockExOutVo>();
		for (StockEx itemEx : stockList) {
			if(null == groupMap.get(itemEx.getBarcode())){
				StockExOutVo item=new StockExOutVo();
				BeanUtils.copyProperties(itemEx, item);
				List<StockEx> s=new ArrayList<StockEx>();
				s.add(itemEx);
				item.setStockItems(s);;
				item.setQty(1L);
				//需要判断是否在库？
				groupMap.put(itemEx.getBarcode(),item);
			}
			else {
				StockExOutVo outVo = groupMap.get(itemEx.getBarcode());
				outVo.getStockItems().add(itemEx);
				//是否会报空指针
				outVo.setQty(outVo.getQty()+1L);
			}
		}
		*//*for(Entry<String, StoreInBillItemEx> entry:groupMap.entrySet()){
			StoreInBillItemEx item=entry.getValue();
			inBillExs.add(item);
		}*//*
		return groupMap;
	}
	
}*/
