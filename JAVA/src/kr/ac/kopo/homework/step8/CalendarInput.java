package kr.ac.kopo.homework.step8;

import java.util.Scanner;

public class CalendarInput {
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.print("원하는 항목을 선택하세요(1.특정년도  2.특정월  3.종료) => ");
		int choice = sc.nextInt();
		int year = 0;
		int month = 0;
		if(choice == 1) {
			year = sc.nextInt();
			Calendar1 c = new Calendar1(year);
			
		}else if(choice == 2) {
			year = sc.nextInt();
			month = sc.nextInt();
			Calendar1 c = new Calendar1(year, month);
			
		}else if(choice == 3) {
//			반복문 종료
		}
	}
}
