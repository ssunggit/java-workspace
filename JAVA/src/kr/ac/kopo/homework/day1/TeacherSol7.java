package kr.ac.kopo.homework.day1;

/*
 * Sol_7
 */
public class TeacherSol7 {
	public static void main(String[] args) {
	
		char ch = 'b';
		char sol= 'a';
		
		if (ch >= 'A' && ch <= 'Z') {
			sol =(char)(ch + ('a'-'A'));
		}else if(ch >= 'a' && ch <= 'z') {
			sol =(char)(ch - ('a'-'A'));
		}
		
		System.out.println(sol);
		
		
	}
}
