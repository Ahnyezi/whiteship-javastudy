package javastudy.week4.syntex;

import java.util.Scanner;

public class MultipleBranches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���ڸ� �Է��ϼ���:");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			
			System.out.println("����Դϴ�.");
			
		} else if (num == 0) {
			
			System.out.println("0 �Դϴ�.");
			
		} else {
			
			System.out.println("�����Դϴ�.");
			
		}

	}

}
