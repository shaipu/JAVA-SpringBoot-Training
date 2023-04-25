package com.encora.util;

public class MyDate {
	public int day;
	public int month;
	public int year;
	
	public MyDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
		if(month>12)
			this.month=12;
		else if(month<1)
			this.month=1;
		
		if(year<2023)
			this.year=2023;
		else if(year>2033)
			this.year=2033;
		
	//for FEB leap year month
		
		if(month==2)
			if(year%4 == 0 && day>29)
				this.day=29;
			else if(year%4 != 0 && day>28)
				this.day=28;
			else if(day<1)
				this.day=1;
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 && day>=31)
			this.day=31;
		else if(day<1)
			this.day=1;
		else if(month==4 || month==6 || month==9 || month==11 && day>=30)
			this.day=30;
		else if(day<1)
			this.day=1;
	  		
	}
	public String toString() {
		return day + "-" + month + "-"+ year;
	}
}
