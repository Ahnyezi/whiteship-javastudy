package javastudy.week4.syntex;

import java.util.Random;

public class IFStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int num = r.nextInt();
		
		if (num > 0) {

			System.out.println("생성한 ");
			System.out.println("난수가 ");
			System.out.println("양수입니다.");
			
		}
		
		if (num > 0) System.out.println("양수라구요.");  
	}

}
