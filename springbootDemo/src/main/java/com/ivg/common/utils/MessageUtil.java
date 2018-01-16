package com.ivg.common.utils;/*package invengo.com.common.utils;

import java.util.HashMap;
import java.util.Map;

import com.dream.biz.cxf.ValidateToken;
import com.dream.biz.model.dto.factory.BaseDTO;

public class MessageUtil {
   
	public static String validateToken(BaseDTO baseDTO,ValidateToken validateToken){
		String message="";
		if(validateToken.validate(baseDTO)==null){
			message+="500-非法登录";
		}else{
			Long clientId=validateToken.getClientId(baseDTO);
			if(null==clientId){
				message+="500-租户信息异常";
			}
		}
		return message;
	}
}*/
