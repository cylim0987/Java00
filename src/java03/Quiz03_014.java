package java03;
import java.util.Scanner;

public class Quiz03_014 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1st�� �Է��Ͻÿ�");
		int a = stdIn.nextInt();
		System.out.println("2nd�� �Է��Ͻÿ�");
		int b = stdIn.nextInt();
		System.out.println("3rd�� �Է��Ͻÿ�");
		int c = stdIn.nextInt();
		
		
		if(a == b && b == c) {
			System.out.println("*");
		}else {
			System.out.println("a,b,c�� ���� �ʴ�");
		}
		
	}

}
