package java03;
import java.util.Scanner;

public class Quiz03_015 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� �Է��Ͻÿ�");
		int a = stdIn.nextInt();
		System.out.println("2nd���� �Է��Ͻÿ�");
		int b = stdIn.nextInt();
		
		if(a * a < b) {
			System.out.println("a�� b�� �����ٺ��� �۽��ϴ�");
		}else {
			System.out.println("a�� b�� �����ٺ��� ũ��.");
		}
		
	}

}
