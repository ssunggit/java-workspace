package kr.ac.kopo.homework.step9;
// 에외처리도 해도됨

// 번호추출하는 방법을 5가지 이상
// getNumbers 메소드 5개

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 로또 게임
게임수를 입력하세요 : 3
게임 1 : [2, 6, 13, 25, 20, 7]
게임 2 : [2, 9, 3, 7, 38, 13]
게임 3 : [40, 10, 38, 39, 42, 18]


class LottoUtil {

    public void start() {
	게임수 입력
        for(int i = 0; i < cnt; i++) {
 
	   게임1 : Arrays.toString(getNumbers())
        }

    }

    private int[] getNumbers() {

	// 1 ~ 45 사이의 로또번호 6개 추출
    }


}


 */

public class LottoUtil {
	public static void main(String[] args) {
		LottoUtil l = new LottoUtil();
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
		int[] arr = new int[6];
		// 1 ~ 45 사이의 로또번호 6개 추출(중복허용하지 않는)
		while (arr[5] == 0) {
			Random r = new Random();
			arr[0] = r.nextInt(45) + 1;
			
			for (int i = 0; i < 6; i++) {
				int num = r.nextInt(45) + 1;
				if (!(arr[i] == num)) {
					arr[i] = num;
				}
			}
		}
		return arr;

	}

}
