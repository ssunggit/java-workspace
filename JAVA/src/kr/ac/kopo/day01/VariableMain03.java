package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		
		int a;
		byte b = 10;
		// �����ʿ� �ִ� b���� ���� a�� ����
		// = : ���Կ���� �⺻�����δ� ���Կ������� ���ʰ� �������� �ڷ����� ���ƾ��Ѵ�.
		// �����ڸ� �������� ������ ������ �ڷ����� �������� ��� ����ȯ�� �Ͼ��. -> �⺻�ڷ���
		
		
		// ������ ����ȯ: ū �ڷ��� Ÿ�Կ� ���� �ڷ����� ����
		//			: ����ȯ �ڵ带 ������ �� �ִ�.
		// ����ȯ �ڵ� ���̵� ������ ������ ������ ���� �ʴ´�.
		a = b; // int = byte
		a = (int)b; // int = (int)byte
		
		// ����� ����ȯ: ���� �ڷ��� Ÿ�Կ� ū �ڷ����� ����
		//			: ����ȯ �ڵ带 ������ ������.
		// ����ȯ �ڵ带 ������� ������ ������ ������ ������ ����.
		b = (byte)a;
		
		System.out.println(10 + 20); // int + int 
		// ū���� ������ Ÿ���� ���󰣴� 
		System.out.println((double)10 + 20.0);
		System.out.println(10 + 20.0);
		
		System.out.println(10 + (int)20.0);
		
		// ���ϱ⿬�꿡�� ����ȯ�� �Ͼ
		double d = 10 + 20.2;
		System.out.println(d);
		
		// ���ϱ� ������ ���Կ����ں��� �켱������ ���Ƽ� ���� ���ȴ�.
		// �׷��⶧���� ����� ����ȯ�� �ʿ�
		int c = (int)(10 + 20.2); 
		System.out.println(c);
		
		// ��� ����� �� ���� �����͸� ��´�.
		// ����� �ݵ�� ��� ���ڸ� �빮�ڷ� ����.
		final int NUM = 100;
		System.out.println("num: " + NUM);
		// NUM = 20;
		// �� ������ �Ұ��ϴ�.
		System.out.println("num: " + NUM);
		
		char ch = '!';
		// ������ ���� ����ǥ�� ��Ÿ���� ���� �ƴ� �׳� ���ڶ�� ǥ���Ҷ� \�� ���δ�
		ch = '\'';
		ch = '\n';
		// �ڹٴ� \�� ������ �� ������ ���ڷ� �ν��Ѵ�-> \�� �ι� ����.
		ch = '\\';
		String path = "D:\\Lecture\\java-workspace";
		System.out.println(path);
		
		String str = "\"ab\"";
		System.out.println(str);
	}

}
