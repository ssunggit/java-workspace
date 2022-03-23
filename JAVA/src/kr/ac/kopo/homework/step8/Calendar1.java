package kr.ac.kopo.homework.step8;

import java.util.Calendar;

public class Calendar1 {
	public int year;
	public int month;
	
	Calendar1(){
		
	}
	
	Calendar1(int year){
		
	}
	
	Calendar1(int year, int month){
		
	}
	
	void makeCalendar(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1);
		int a = c.get(year);
		int test = c.getActualMaximum(a);
		System.out.println(test);
	}
	
	
	
	
	
}
