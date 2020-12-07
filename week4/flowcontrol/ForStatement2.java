package javastudy.week4.syntex;

import java.util.Arrays;
import java.util.Random;

public class ForStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		int[] values = new int[10];
		int num;
		int sum = 0;

		for (int i = 0; i < 10; i++, sum += num) {

			num = r.nextInt(10);// 10 아래의 난수를 생성
			values[i] = num;// 배열의 각 방에 초기화

		}

		System.out.println(Arrays.toString(values));
		System.out.println("합은 " + sum + "입니다");

	}

}
