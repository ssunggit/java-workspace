package login;

import java.util.Scanner;

import member.User;

public class SignUp {
	public void signUp() {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		
		System.out.println("===================<  회원가입  >===================");
		
		System.out.print("#. 이름 : ");
		user.setName(sc.nextLine());
		
		System.out.print("#. 전화번호 : ");
		user.setPhone(sc.nextLine());

		System.out.print("#. 아이디 : ");
		user.setId(sc.nextLine());
		
		System.out.print("#. 비밀번호 : ");
		user.setPw(sc.nextLine());
		
		user.list(user);
		
		
	}


}
