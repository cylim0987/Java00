package java03;
//���� �ٽ� �� ��
import java.util.Scanner;

public class Quiz03_012 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� �Է��Ͻÿ�");
		int n = stdIn.nextInt();
		
		switch(n) {
		case 1 : System.out.print("A");
		case 2 : System.out.print("B");
			break;
		default : System.out.print("C");
		}
		// 1 : AB
		// 2 : B
		// �׿� : C
	}

}
