package java04;

import java.util.Scanner;

public class SignRepeat {
//���� �������� ��ȣ�� �����ؼ� ǥ��(���ϴ� ��ŭ �ݺ�)
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int retry;

		do {

			System.out.print("������ : ");
			int x = stdIn.nextInt();

			if (x > 0) {
				System.out.println("�� ���� �����.");
			} else if (x < 0) {
				System.out.println("�� ���� ������.");
			} else {
				System.out.println("0�� �Է��Ͽ���.");
			}

			System.out.println("�ٽ� �� �� �� �ǰ�? ��-1 / �ƴϿ�-2");
			retry = stdIn.nextInt();
		} while (retry == 1);

	}

}
