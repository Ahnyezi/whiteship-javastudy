package javastudy.week4.syntex;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("도메인을 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		String domain = sc.nextLine().toLowerCase();
		
		switch (domain) {
		
			case "kr":
				System.out.println("대한민국");
				break;
				
			case "us":
				System.out.println("미국");
				break;
			
			case "cn":
				System.out.println("중국");
				break;
				
			case "jp":
				System.out.println("일본");
				break;
				
			default:
				System.out.println("알 수 없는 나라");
				break;
				
		}
	}
}
