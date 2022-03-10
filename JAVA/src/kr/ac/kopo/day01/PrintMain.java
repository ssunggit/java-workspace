package kr.ac.kopo.day01;
//�ּ����� ��� �����Ͻ� �ݿ� ���� �ʴ´�. �����ڰ� �ڽ��� �ڵ带 �����ϱ� ���� ����
// ������ �ּ� �ڵ�ȿ� ���� �ּ�ó���� �ȵ� �� /**/ �ȿ� /**/ ���� �ȵ�

/*
������
�ּ���
�����մϴ�
 */

// ���� �ּ��� ����

/*
 �������
 1. ������ ���
 2. �Ǽ��� ���
 3. ������ ���: �빮��('A'), �ҹ���('a'), ���ڹ���('1'), Ư������('!'), 
 			  ���鹮��(�����̽�(' '), ����('\n'), ��('\t')),
 			  �ѱ�('��')
 4. ���ڿ� ���("abc")
 5. ���� ���(true, false)
 */

/*
 ��¸޼ҵ�
 1. println()	: ���๮�� ����
 2. print()		: ���๮�� ����X
 3. printf()	: JDK1.5 �߰�, ���๮�� ����X, ��¹��� ����
 				: �ֵ���ǥ�ȿ� ���ڿ��鸸 ����ϴ� ���� ���� -> ��¹��ڸ� ����.
	��¹���(���˹���) 
	%d	: ����
	%f	: �Ǽ�
	%c	: ����
	%s	: ���ڿ�
	%b	: ��
	
 					
 */

public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10); // ln�� ��� �ٹٲ� -> ���๮��
		System.out.println(13.14); 
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true); 
		
		// �ϳ��� ��¹��ȿ� �������� ����Ÿ���� ������� �� �����
		System.out.println("23��"); 
		System.out.print(23); 
		System.out.println("��");
		System.out.println(23 + "��"); // + : �̾� ���̱�
		
		// 10 + 20 = 30
		System.out.println(10 + " + " + 20 + " = " + 10 + 20); // 10 + 20 = 1020
		System.out.println(10 + " + " + 20 + " = " + (10 + 20)); // 10 + 20 = 30 
		
		System.out.printf("%d��\n", 23); //���鹮�ڷ� �ٹٲ���
		System.out.println(); //��¾��� �ٹٲ޸� ��
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
	
		System.out.printf("[%7d]\n", 1200); // 7�ڸ��� ����Ͽ� �⺻������ ������ ����
		System.out.printf("[%7d]\n", 950);
		System.out.printf("[%-7d]\n", 15800); // 7�ڸ��� ����Ͽ� ���� ���� 
		System.out.printf("[%04d]\n", 45); // 4�ڸ��� ����ϸ� ���ڸ� 0���� ä�� 
		System.out.printf("[%f]\n", 12.2456); // �⺻������ �Ҽ��� 6��°�ڸ����� ��� 
		System.out.printf("[%.2f]\n", 12.2456); // �Ҽ��� 2��°�ڸ����� ��µǸ� �ݿø��� ��
		System.out.printf("%b\n", true);
		System.out.printf( "���� ������ %d�ÿ� %s" , 12, "�����Ĵ�");

	}

}
