package com.test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static long getTime(String dateFormat, String date) throws ParseException {
        DateFormat dateformat = new SimpleDateFormat(dateFormat);
        return dateformat.parse(date).getTime();
    }

    public static String getDate(long dateLong,String dateFormat){
        Date date=new Date(dateLong);
        DateFormat dateformat = new SimpleDateFormat(dateFormat);
        return dateformat.format(date);
    }
}
