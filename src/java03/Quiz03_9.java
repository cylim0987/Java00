package java03;

import java.util.Scanner;

public class Quiz03_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("'��'�� �Է��Ͻÿ�");
		int m = stdIn.nextInt();
		
		if(!(m<3 || m>5)) {
			System.out.println("���Դϴ�.");
		}else {
			System.out.println("���� �ƴմϴ�");
		}
		
	}

}
