package com.atguigu.test;

import java.util.Calendar;

public class MyDate{
	 int day;
	 int month;
	 int year;
	 public MyDate(){}
	 public MyDate(int day,int month,int year){
	  this.day = day;
	  this.month = month;
	  this.year = year;
	 }
	 public void funtion(MyDate d){
	  int newDay = d.day;
	  int newMonth = d.month;
	  int newYear = d.year;
	  Calendar c1 = Calendar.getInstance();
	  c1.set(newYear,newMonth,newDay);
	  long n1 = c1.getTimeInMillis();
	  Calendar c2 = Calendar.getInstance();
	  c2.set(year,month,day);
	  long n2 = c2.getTimeInMillis();
	  System.out.println( "相差天数为:" + Math.abs((n1 - n2)/24/3600000)); }
	 public static void main(String[] args){
	  MyDate d1 = new MyDate(1,1,2008);
	  MyDate d2 = new MyDate(2,1,2001);
	  d1.funtion(d2);
	 }
	}