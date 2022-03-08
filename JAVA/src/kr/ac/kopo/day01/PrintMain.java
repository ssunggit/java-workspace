package kr.ac.kopo.day01;
//주석문의 경우 컴파일시 반영 되지 않는다. 개발자가 자신의 코드를 설명하기 위한 목적
// 여러줄 주석 코드안에 다중 주석처리가 안됨 즉 /**/ 안에 /**/ 쓰면 안됨
/*
여러줄
주석이
가능합니다
 */

// 한줄 주석이 가능

/*
 상수종류
 1. 정수
 2. 실수
 3. 문자('a','b')
 4. 문자열("abc")
 5. 논리형(true, false)
 */

/*
 출력메소드
 1. println()	: 개행문자 포함
 2. print()		: 개행문자 불포함
 */

public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10); // ln의 경우 줄바꿈 -> 개행문자
		System.out.println(13.14); 
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true); 
		
		// 하나의 출력문안에 여러개의 문자타입을 쓰고싶을 때 방법들
		System.out.println("23살"); 
		System.out.print(23); 
		System.out.println("살");
		System.out.println(23 + "살"); // + : 이어 붙이기
		
		
		
		
	}

}
