package kr.ac.kopo.day01;
// �ܺ��� �ٸ� ��Ű��, Ŭ������ ������ ������� �� import 
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char ch =sc.nextLine().charAt(0);	
		System.out.println("ch : "+ ch);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		// �ܾ �Է¹����� (���� �ȴ�)
		//String str =sc.next();
		// ������ �Է¹�����
		String str2 =sc.nextLine();		
		//System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		// Ű����� �Է¹��� ����
		int a = sc.nextInt();
		System.out.println("a : " + a);
		
		// �Է��� ����, ����, �Ǽ� ����
	
	}

}
