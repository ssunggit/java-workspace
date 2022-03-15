package kr.ac.kopo.homework.step4;
/*
 
아이스크림 몇개 구입할꺼야? => 3 (키보드 입력)

*** 1번째 아이스크림 구매정보 ***
아이스크림명 : 비비빅(키보드)
아이스크림가격 : 700(키보드)

*** 2번째 아이스크림 구매정보 ***
아이스크림명 : 월드콘(키보드)
아이스크림가격 : 1500(키보드)

*** 3번째 아이스크림 구매정보 ***
아이스크림명 : 메로나(키보드)
아이스크림가격 : 1000(키보드)

< 총 3개의 아이스크림 구매정보 출력 >
번호   아이스크림명    가격
1     비비빅         700
2
3

   총 판매액 : XXXX원 
   
   
 */

import java.util.Scanner;

class IceCream{
	String name;
	int price;
}

public class Solution01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇개 구입할꺼야? => ");
		int count = sc.nextInt();
		
		IceCream[] icArr=new IceCream[count];	
		
		int sum = 0;
		sc.nextLine();
		
		for(int i = 0; i < count ; i++) {
			System.out.printf("%d번째 아이스크림 구매정보\n", i+1);
			IceCream ic = new IceCream();
			
			System.out.print("아이스크림명 : ");
			ic.name = sc.nextLine();
			
			System.out.print("아이스크림가격 : ");
			ic.price = sc.nextInt();
				
			sum += ic.price;
			sc.nextLine();
			icArr[i] = ic;
		}
		
		
		for(IceCream ic : icArr) {
			System.out.println(ic.name);
			System.out.println(ic.price);
		}
		
		System.out.println(sum);
		
	}
	
}
