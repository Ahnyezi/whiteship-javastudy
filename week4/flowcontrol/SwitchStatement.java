package javastudy.week4.syntex;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�������� �Է��ϼ���:");
		
		Scanner sc = new Scanner(System.in);
		String domain = sc.nextLine().toLowerCase();
		
		switch (domain) {
		
			case "kr":
				System.out.println("���ѹα�");
				break;
				
			case "us":
				System.out.println("�̱�");
				break;
			
			case "cn":
				System.out.println("�߱�");
				break;
				
			case "jp":
				System.out.println("�Ϻ�");
				break;
				
			default:
				System.out.println("�� �� ���� ����");
				break;
				
		}
	}
}
