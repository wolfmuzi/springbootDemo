package com.ivg.common.utils;/*
package invengo.com.common.utils;

*/
/*
 * 
 * @author Resun86
 *//*


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.api.ApiCall;
import com.dream.api.ApiCallParam;
import com.dream.api.ApiResponse;
import com.dream.api.ApiUrl;
import com.dream.biz.model.dto.factory.CreateProductOrderDTO;
import com.dream.biz.model.status.EntityStatus.StoreOutBillStatus;
import com.dream.common.framework.exception.DreamExceptionCode;
import com.dream.common.model.vo.fixed.Response;
import com.dream.comp.redis.service.RedisCacheServiceImpl;

@Service
public class SerialNumGeneration {

	private static Logger logger = Logger.getLogger(SerialNumGeneration.class);

	@Autowired
	protected RedisCacheServiceImpl redisCache;

	Response Response = new Response();

	public static final String CONTAINER_NUM = "Container";
	public static final String DELIVERY_NUM = "Delivery";
	public static final String SERIAL_NUM = "Serial";

	@SuppressWarnings("static-access")
	public Response getSerialNum(String type, String supplierCode, String serialNum) {

		if (SERIAL_NUM.equals(type)) {
			// 标签绑定流水号
			String SerialNum = createSerialNum();
			return Response.createSuccessResponse("标签绑定流水号创建成功！", SerialNum);
		} else if (CONTAINER_NUM.equals(type)) {
			// 包装箱号
			String ContainerNum = createContainerNum(supplierCode);
			return Response.createSuccessResponse("包装箱号创建成功！", ContainerNum);
		} else if (DELIVERY_NUM.equals(type)) {
			// 运单号
			String DeliveryNum = createDeliveryNum(serialNum);
			return Response.createSuccessResponse("运单号创建成功！", DeliveryNum);
		} else {
			return Response.createErrorResponse(DreamExceptionCode.SYS_OPT_FAIL);
		}

	}

	// 生成绑定流水号
	private String createSerialNum() {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		String thisYear = sdf.format(date);
		String key = "YTO" + thisYear;

		if (null == redisCache.get(key)) {
			redisCache.set(key, String.format("%07d", 1));
			return key + String.format("%07d", 1);
		}
		Object num = redisCache.get(key);
		int value = Integer.valueOf(num.toString()) + 1;
		redisCache.set(key, String.format("%07d", value));
		return key + String.format("%07d", value);
	}

	// 生成箱号
	private String createContainerNum(String supplierCode) {
		// TODO Auto-generated method stub

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String todayTime = sdf.format(date);
		String key = "SH" + "-" + supplierCode + "-" + todayTime + "-";

		if (redisCache.get(key) == null) {
			redisCache.set(key, String.format("%03d", 1), 24 * 60 * 60L);
			return key + String.format("%03d", 1);
		}
		Object num = redisCache.get(key);
		int value = Integer.valueOf(num.toString()) + 1;
		if (value == 1000) {
			value = 1;
		}
		redisCache.set(key, String.format("%03d", value));
		return key + String.format("%03d", value);
	}
	
	// 生成运单号
	private String createDeliveryNum(String SerialNum) {
		// TODO Auto-generated method stub

		String key = SerialNum;

		if (null == redisCache.get(key)) {
			redisCache.set(key, String.format("%03d", 1));
			return key + String.format("%03d", 1);
		}
		Object num = redisCache.get(key);
		int value = Integer.valueOf(num.toString()) + 1;
		if (value == 1000) {
			value = 1;
		}
		redisCache.set(key, String.format("%03d", value));
		return key + String.format("%03d", value);
	}

	@SuppressWarnings("static-access")
	public Response createProductionOrder(CreateProductOrderDTO dto) {
		if (null == dto || null == dto.getSupplierCode() || 
				dto.getSupplierCode().isEmpty() || null == dto.getContractNum() || dto.getContractNum().isEmpty()) {
			return Response.createErrorResponse(DreamExceptionCode.FACTORY_REQUEST_PARAM_ERROR);
		}
		
		ApiCallParam.createProductionOrder vo = new ApiCallParam.createProductionOrder();
		vo.setContractNumber(dto.getContractNum());
		vo.setFromBusinessUnitCode(dto.getSupplierCode());
		ApiResponse<String> res = ApiCall.callPostJsonRemoteApi(ApiUrl.CREATE_PRODUCTION_ORDER, vo, String.class);
		if (res.getHttpStatus() != HttpStatus.SC_OK) {
			return Response.createFailResponse(res);
		}
		return Response.createSuccessResponse("获取生产订单号成功！", res.getData());
	}

	
	// 生成箱号横调
		public String createCazeCode(String supplierCode) {

			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String todayTime = sdf.format(date);
			String key = StoreOutBillStatus.CazeCode +supplierCode + StringUtils.substring(todayTime, 4);

			if (redisCache.get(key) == null) {
				redisCache.set(key, String.format("%03d", 1), 24 * 60 * 60L);
				return key + String.format("%03d", 1);
			}
			Object num = redisCache.get(key);
			int value = Integer.valueOf(num.toString()) + 1;
			if (value == 1000) {
				value = 1;
			}
			redisCache.set(key, String.format("%03d", value));
			return key + String.format("%03d", value);
		}
	
}
*/
