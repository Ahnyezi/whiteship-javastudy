package javastudy.week4.syntex;

import java.util.Scanner;

public class MultipleBranches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자를 입력하세요:");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			
			System.out.println("양수입니다.");
			
		} else if (num == 0) {
			
			System.out.println("0 입니다.");
			
		} else {
			
			System.out.println("음수입니다.");
			
		}

	}

}
