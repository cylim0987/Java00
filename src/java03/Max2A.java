package java03;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		Scanner stdDouble = new Scanner(System.in);
		
		System.out.println("�Ǽ� a : ");
		double x = stdDouble.nextDouble();
		
		System.out.println("�Ǽ� b : ");
		double y = stdDouble.nextDouble();
		
		if(x > y) {
			System.out.println("ū���� " + x);
		}else if(x < y) {
			System.out.println("ū���� " + y);
		}else {
			System.out.println("a���� b���� ����");
		}
		
		
	}

}
