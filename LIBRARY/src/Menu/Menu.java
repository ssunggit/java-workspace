package Menu;

import java.util.Scanner;

import login.SignUp;
import member.User;

public class Menu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===============<Welcome To Library>===============");
			System.out.println("1. 회원가입\t 2. 로그인\t 3. 종료");

			int userChoice = Integer.parseInt(sc.nextLine());
			SignUp signUp = new SignUp();
			User user = new User();
			if (userChoice == 1) {
				signUp.signUp();
				
				
			} else if (userChoice == 2) {
				
			} else {
				
				System.out.println("도서관 프로그램을 중단하겠습니다.");
				break;
			}
		}
		
		User user = new User();
		
		for(int i = 0; i<user.userArr.size(); i++) {
			System.out.println(user.userArr.get(i).getId());
			System.out.println(user.userArr.get(i).getName());
			System.out.println(user.userArr.get(i).getPhone());
			System.out.println(user.userArr.get(i).getPw());
		}
		System.out.println("오고있니");
	}
}
