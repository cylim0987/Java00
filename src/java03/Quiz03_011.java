package java03;
//���� �ٽ� �� ��
import java.util.Scanner;

public class Quiz03_011 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�");
		int m = stdIn.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		int n = stdIn.nextInt();

		if(m > n) {
			int t = m;
			m = n;
			n = t;
		}
		System.out.println("m=<n�� �ǵ��� �����Ͽ���.");
		System.out.println("���� m��" + m + "�̴�.");
		System.out.println("���� n��" + n + "�̴�.");
		
	}

}
