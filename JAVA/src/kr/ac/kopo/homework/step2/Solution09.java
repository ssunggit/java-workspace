package kr.ac.kopo.homework.step2;

import java.util.Scanner;

/* 9
 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
*********
-******* 
--***** 
---***
----* 
 

 */
public class Solution09 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
