package com.test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static long getTime(String dateFormat, String date) {
        DateFormat dateformat = new SimpleDateFormat(dateFormat);
        long timeInMs = 0;
        try {
            timeInMs = dateformat.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timeInMs;
    }

    public static String getDate(long dateLong, String dateFormat) {
        Date date = new Date(dateLong);
        DateFormat dateformat = new SimpleDateFormat(dateFormat);
        return dateformat.format(date);
    }
}
