package com.atguigu.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestGit {
	
	public static void main1(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = dateFormat.parse("1990-02-03");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parse);
		int i = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(i);
		MyDate myDate1 = new MyDate(2016, 02, 04);

		MyDate myDate = new MyDate(2016, 02, 06);
		myDate.funtion(myDate1);
		
		/*System.out.println("请输入***");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(string);*/
	/*	int n = daysBetweenTwoDays("1990-02-03","1990-02-04");
		System.out.println(n);*/
	
	
	}
	
	
	
	public static int daysBetweenTwoDays(String firstDays,String secendDays){
		String[] strings1 = firstDays.split("-");
		int firstYear = Integer.parseInt(strings1[0]);
		int firstMonth = Integer.parseInt(strings1[1]);
		int firstDay =Integer.parseInt(strings1[2]);
		System.out.println(firstDay+ " " + firstMonth + " " + firstYear );
		String[] strings2 = secendDays.split("-");
		int secendYear = Integer.parseInt(strings2[0]);
		int secendMonth = Integer.parseInt(strings2[1]);
		int secendDay =Integer.parseInt(strings2[2]);
		System.out.println("secendYear"+ secendDay);
		Calendar instance1 = Calendar.getInstance();
		instance1.set(firstYear,firstMonth,firstDay);
		long n1 = instance1.getTimeInMillis();
		
		System.out.println(n1);
		
		Calendar instance2 = Calendar.getInstance();
		instance2.set(secendYear, secendMonth,secendDay);
		long n2 = instance1.getTimeInMillis();
		System.out.println(n2);
		System.out.println(Math.abs((n2-n1)/24/3600000));
		int n3 =(int)Math.abs((n2-n1)/24/3600000);
		return n3;
	}
	
	

}
