package java03;

import java.util.Scanner;

public class Quiz03_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�");
		int m = stdIn.nextInt();
		
		if(m % 3 == 0) {
			System.out.println("3���� ��������");
		}else if(m%3==1){
			System.out.println("3���� ���� �������� 1");
		}else {
			System.out.println("3���� ���� �������� 2");
		}
		
	}

}
