package java03;

import java.util.Scanner;

public class Max2A_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�Ǽ� a : ");
		double x = stdIn.nextDouble();
		
		System.out.println("�Ǽ� b : ");
		double y = stdIn.nextDouble();
		
		double max;
		
		if(x > y) {
			max = x;
			System.out.println("ū ���� " + max);
		}else if(x < y) {
			max = y;
		}else {
			System.out.println("���� ����");
		}
	//	System.out.println("ū ���� " + max);
	//  ???????????????
		
	}

}
