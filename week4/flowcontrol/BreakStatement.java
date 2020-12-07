package javastudy.week4.syntex;

import java.util.Random;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Random random = new Random();

        while (true) {

            int num = random.nextInt(50);
            System.out.print(num + " ");

            if (num == 22) {

                break;
            }
        }

        System.out.print('\n');

	}

}
