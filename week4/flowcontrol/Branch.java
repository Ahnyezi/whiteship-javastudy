package javastudy.week4.syntex;

import java.util.Random;

public class Branch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int num = r.nextInt();
		
		if (num > 0) {
			
			System.out.println("양수입니다.");
			
		}
		else {
			
			System.out.println("양수가 아닙니다.");
			
		}

	}

}
