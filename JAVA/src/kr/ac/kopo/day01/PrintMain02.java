package kr.ac.kopo.day01;

public class PrintMain02 {
	/*
	 ASCII CODE(0~256�� ǥ������):1byte
	 	�빮��, �ҹ���, ���ڹ���, Ư������,���鹮�ڸ� ���ڷ� �ϴ��� ��Ī��Ų ����ǥ	
	 		
	 UNICODE(0~65500) :2byte
	 	�ٱ��� ���� ����ǥ(ASCII CODE + �ѱ�, ����, ... )
	 	�ڹ��� �����ν�
	 	
	 		10����	16����	
	 	'A' : 65 	0x41
	 	'a' : 97	0x61
	 	'0' : 48	0x30
		
	 */
	
	// bit : 0, 1
	// 1byte = 8bit
	
	// EUC-KR 2byte
	// UTF-8  3byte
	
	public static void main(String[] args) {
		System.out.println('A'); // A
		System.out.println('A' + "BCD"); // ABCD
		System.out.println('A' + 'B'); // 65+66=131 
		System.out.println('A' + 10); // 65+10=75
	}

}
