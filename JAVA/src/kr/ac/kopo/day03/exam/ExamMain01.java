package kr.ac.kopo.day03.exam;
/*1
  	*****
  - 제약조건 : 출력문안에는 반드시 하나의 문자만 가능
  
 */

/*2
 
 	*****
 	*****
 	*****
 - 제약조건 : 출력문안에는 반드시 하나의 문자만 가능
 
*/

// 자바에서는 항상 행방향으로 반복을 생각해야한다! (자바의 경우 콘솔이 기본인데 엔터를 치면 커서가 내려가서 위로 못올라간다)
// 자바의 반복문은 무조건 행우선 반복
public class ExamMain01 {
	
	public static void main(String[] args) {
	/*
		// 무한루프 for( ; ; )
//		for(int i = 1; i <= 10 ; i++) {
//		for(int i = 10; i >= 1 ; i--) {
//		for(int i = 0; i <= 9 ; i++) {
//		for(int i = 5; i <= 14 ; i++) {
		for(int i = 5; i >= -4 ; i--) {
			System.out.println("Hello");
		}
	*/
	
	/*1
		for(int i = 1; i <= 5; i++){
			System.out.print("*");
		}
	*/
	
		//*2
		//2중 루프문(for문)
		
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j <= 5; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		for(int j = 1; j <= 5; j ++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int j = 1; j <= 5; j ++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int j = 1; j <= 5; j ++) {
			System.out.print("*");
		}
		System.out.println();
		*/
		
		
		
		
		
	}

}
