package com.execise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		System.out.println(getLastDayOfMonth(2012, 03));
		String a="2017-09-10";
		String b=String.valueOf(a.substring(5,7));
		String c=String.valueOf(a.substring(8,10));
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	public static String getLastDayOfMonth(int year, int month){
		Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf.format(cal.getTime());
         
        return lastDayOfMonth;//格式为2012-03-31
	}

}
