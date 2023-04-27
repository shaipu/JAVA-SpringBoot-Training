	package com.encora.util;

public class MyDate {
	public int day;
	public int month;
	public int year;
	
	public MyDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
		if(year<2023)
			this.year=2023;
		else if(year>2036)
			this.year=2036;
		
		if(month>12)
			this.month=12;
		else if(month<1)
			this.month=1;
		
	//for FEB leap year month
		
		if(this.month==2)
			if(this.year%4 == 0 && day>29)
				this.day=29;
			else if(this.year%4 != 0 && day>28)
				this.day=28;
			else if(day<1)
				this.day=1;
		
		if((this.month==1 || this.month==3 ||this.month==5 || this.month==7 || this.month==8 || this.month==10 || this.month==12) && (day>=31))
			this.day=31;
		else if(day<1)
			this.day=1;
		else if((this.month==4 || this.month==6 || this.month==9 || this.month==11) && (day>=30))
			this.day=30;
		else if(day<1)
			this.day=1;
	  		
	}
	public String toString() {
		return day + "-" + month + "-"+ year;
	}
}
