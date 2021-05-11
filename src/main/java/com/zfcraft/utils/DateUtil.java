package com.zfcraft.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    /**
     * 得到当前时间戳
     * @return
     */
    public static Long getCurrentTimeStamp() {
        long timeMillis = System.currentTimeMillis();
        return timeMillis;
    }

    public static Date getCurrentDate() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.format(date);
        return date;
    }
}