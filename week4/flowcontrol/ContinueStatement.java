package javastudy.week4.syntex;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;

		while (num < 30) {
			
			num++;
			
			if ((num % 2) == 0) {//짝수일 경우 뒤의 명령은 시행하지 않는다
				
				continue;
				
			}

			System.out.println(num + " ");
		}

		System.out.println('\n');

	}

}
