package java03;

import java.util.Scanner;

public class Max2B {

	public static void main(String[] args) {
		Scanner stdDouble = new Scanner(System.in);
		
		System.out.println("�Ǽ� a : ");
		double x = stdDouble.nextDouble();
		
		System.out.println("�Ǽ� b : ");
		double y = stdDouble.nextDouble();
		

		
		double max = x > y ? x : y;
				//ex:7 > 3 ? 7 : 3 -- 7;
				//ex:3 > 8 ? 3 : 8 -- 8;
		System.out.println("ū ���� ���� " + max + "�̴�.");
		
		
		
	}

}
