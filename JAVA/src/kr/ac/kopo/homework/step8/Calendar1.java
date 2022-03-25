package kr.ac.kopo.homework.step8;
/*

원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => 1
년도를 선택하세요 : 2022
< 2022년 1월 >
일  월  화  수  목  금  토
                    1
2  3  4  5

< 2022년 2월 >
...
< 2022년 12월 >

원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => 2
년도를 선택하세요 : 2022
월을 선택하세요 : 4
< 2022년 4월 >
일  월  화  수  목  금  토
                1   2
3   4

원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => 3

 */
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
