package javastudy.week4.syntex;

public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ch = { "��", " ", "��", "��", "��", " ", "��", "ȿ", "��", "\n" };

		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i]);

		}

		System.out.print("�Ųٷ� �ص� ");

		for (int i = ch.length - 1; i >= 0; i--) {

			System.out.print(ch[i]);

		}

	}

}
