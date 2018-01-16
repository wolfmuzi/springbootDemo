/**
 * @Title: DateUtils.java
 * @Package com.dream.biz.service.utils
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: zy1458
 * @date: 2017年4月20日 下午3:48:45
 * @version V1.0
 * @Copyright: 2017 www.ivg.ivg Inc. All rights reserved.
 */
package com.ivg.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: DateUtils
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: zy1458
 * @date: 2017年4月20日 下午3:48:45
 */
public class DateUtils {

    public static Long getDaysOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return Long.valueOf(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }

    /***
     * 给日期增加多少天
     *
     * @param calDate
     * @param addDate 类型必须是long
     * @return
     */
    public static Date addCalendarDay(Date calDate, long addDate) {
        long time = calDate.getTime();
        addDate = addDate * 24 * 60 * 60 * 1000;
        time += addDate;
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return new Date(time);
    }
}
