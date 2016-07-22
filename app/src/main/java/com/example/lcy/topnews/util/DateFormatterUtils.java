package com.example.lcy.topnews.util;

import android.text.TextUtils;

import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-12.
 */
public class DateFormatterUtils {
    public static String formatDate(String format) {
        if(TextUtils.isEmpty(format)) {
            format="yyyy/MM/dd hh:mm:ss";
        }
        DateTime data = new DateTime();

        return data.toString(format);

    }

    private static final long minute = 60 * 1000; //分钟
    private static final long hour = 60 * minute; //小时
    private static final long day = 24 * hour;    //天
    private static final long week = 7 * day;     //周
    private static final long month = 31 * day;   //月
    private static final long year = 12 * month;  //年

    public static String getRecentlyTimeFormatText(DateTime date) {
        if (date == null) {
            return null;
        }
        long diff = new Date().getTime() - date.getMillis();
        long r = 0;
        if (diff > year) {

            return date.toString("yyyy年MM月dd日");
        }
        if (diff > day) {

            return date.toString("MM月dd日");
        }
        if (diff > hour) {
            r = (diff / hour);
            return r + "小时前";
        }
        if (diff > minute) {
            r = (diff / minute);
            return r + "分钟前";
        }
        return "刚刚";
    }

    public static String getRecentlyTimeFormatText(String time, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
            date = new Date();
        }
        return getRecentlyTimeFormatText(new DateTime(date.getTime()));
    }


    /**
     * 转换日期格式到用户体验好的时间格式
     * @return
     */
    public static String dateString2GoodExperienceFormat(String time) {
        if (isNullString(time)) {
            return "";
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08"));
            try {
                String timeString;
                Date parse = simpleDateFormat.parse(time);
                long distanceTime = new Date().getTime() - parse.getTime();
                if (distanceTime < 0L) {
                    timeString = "0 mins ago";
                } else {
                    long n2 = distanceTime / 60000L;
                    new SimpleDateFormat("HH:mm");
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM-dd");
                    if (n2 < 60L) {
                        timeString = String.valueOf(n2) + " mins ago";
                    } else if (n2 < 720L) {
                        timeString = String.valueOf(n2 / 60L) + " hours ago";
                    } else {
                        timeString = simpleDateFormat2.format(parse);
                    }
                }
                return timeString;
            } catch (Exception ex) {
                ex.printStackTrace();
                return "";
            }
        }
    }

    public static boolean isNullString(String s) {
        return s == null || s.equals("") || s.equals("null");
    }
}
