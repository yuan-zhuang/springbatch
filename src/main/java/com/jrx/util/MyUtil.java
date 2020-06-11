package com.jrx.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {

    /**
     * 获取当前时间的字符串格式。
     */
    public static String getDateString()
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(date);
    }
    /**
     * 获取当前时间的字符串格式。
     * @return
     */
    public static String getDateString1()
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        return sdf.format(date);
    }
    /**
     * 年月日
     * @return
     */
    public static String getDateString2()
    {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static String getDateString3()
    {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(date);
    }
}
