package kr.ac.kopo.homework.step9;

import java.util.Arrays;
import java.util.Scanner;



public class LottoUtil02 {
	public static void main(String[] args) {
		LottoUtil02 l = new LottoUtil02();
		l.start();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임수를 입력하세요 : ");
		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			System.out.print("게임 " + (i + 1) + " : ");
			System.out.println(Arrays.toString(getNumbers()));
		}

	}

	private int[] getNumbers() {
		return null;
	}

}
