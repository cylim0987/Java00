package java03;

import java.util.Scanner;

public class Quiz03_7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("'��'�� �Է��Ͻÿ�");
		int m = stdIn.nextInt();
		
		if(m>2 && m<6) {
			System.out.println("���Դϴ�.");
		}else {
			System.out.println("���� �ƴմϴ�");
		}
		
	}

}
