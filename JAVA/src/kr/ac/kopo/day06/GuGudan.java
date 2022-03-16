package kr.ac.kopo.day06;

import java.util.Scanner;

public class GuGudan {
	
	int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}

	void print(int dan) {
		System.out.println("***" + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}

	void print() {
		for (int dan = 2; dan <= 9; dan++) {
			// 본인의 클래스에서 호출할경우 인스턴스 객체를 만들지 않아도 된다.
			print(dan);
		}
	}
	
//	void print() {
//		for (int dan = 2; dan <= 9; dan++) {
//			System.out.println("***" + dan + "단 ***");
//			for (int i = 1; i <= 9; i++) {
//				System.out.println(dan + "*" + i + "=" + (dan * i));
//			}
//		}
//	}
	
}
