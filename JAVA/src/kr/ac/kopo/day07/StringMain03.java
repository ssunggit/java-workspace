package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {
	public static void main(String[] args) {
			
			String str = "hello world!";
			
			/*
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'r')
					System.out.println("r 위치 : " + i);
			}
			*/
//			char search = 'r';
//			String search = "llo";
			String search = "p"; 
													// 제일 첫번째로 나오는 문자의 인덱스
													// 0번지 인덱스부터 검색한다
			System.out.println(search + " 위치 : " + str.indexOf(search));
													// 5번지부터 검색해라
			System.out.println(search + " 위치 : " + str.indexOf(search, 5));
			
			System.out.println("< " + search + " 위치 검색 >");
			str = "hello world!";
			search = "l";
			int index = str.indexOf(search);
			while(index != -1) {
				System.out.println("시작인덱스 : " + index);
				index = str.indexOf(search, index+1);
			}
			
			str = "hello world!";
								// 원본은 변하지 않는다.
			String subStr = str.substring(3, 8);	// [3] ~ [8-1]  문자열로 변환
			System.out.println("substring(3,8) : " + subStr);
													// [6] 부터 마지막 인덱스 까지 
			System.out.println("substring(6) : " + str.substring(6));
			
			// 두가지 방법 다 사용가능하지만 +가 더 편하다 
			String str2 = "hello" + "!!!!";
			str2 = "hello".concat("!!!!");
			System.out.println("concat() : " + str2);
			
			String result = str.replace("l", "rr");
			System.out.println("replace(\"l\", \"rr\") : " + result);
			
			str = "    hello world     ";
			System.out.printf("[%s] 길이 : %d\n", str, str.length());
			// 문자열 사이 공백은 제거하지 않는다 
			result = str.trim();
			System.out.printf("[%s] 길이 : %d\n", result, result.length());
			
			str = "Hello world!!";
			System.out.println("str : " + str);
			System.out.println("대문자 : " + str.toUpperCase());
			System.out.println("소문자 : " + str.toLowerCase());
			
			String data = "홍길동전:허균:조선시대";
			String[] bookInfo = data.split(":");
			System.out.println("split() : " + Arrays.toString(bookInfo));
			
			
			int num= 123;
			String strNum = String.valueOf(num); // num + ""
			
			System.out.println(strNum+100);
		}
}





