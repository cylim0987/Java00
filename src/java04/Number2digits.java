package java04;

import java.util.Random;
import java.util.Scanner;

public class Number2digits {
//���� ���߱� ���� . 2�ڸ��� ������(10~99)�� ���ߴ�. ���� ����, if��, do��
	public static void main(String[] args) {

		Random rand = new Random();
		int x = rand.nextInt(99); //

		System.out.println("���� ���߱� ������...1���� 99���� ���纸��");
		System.out.println("�������� ���ΰ�?(üũ��) " + x);

		Scanner stdIn = new Scanner(System.in);

		System.out.print("�����Է� :");
		int y; // do �Ʒ�

		do {
			y = stdIn.nextInt(); // do ��

			if (y > x) {
				System.out.println("�Է��� ���� ���������� ũ��");
			} else if (y < x) {
				System.out.println("�Է��� ���� ���������� �۴�");
			}

			// y��(�Է°�) �� x��(����)�� ��ġ���� ������ �ݺ�.
		} while (y != x); //x, y���� ���� ������ do�� �ݺ�. x�� y���� ���� ������ do���� ����
		System.out.println("����. ���� ��.");

	}

}
