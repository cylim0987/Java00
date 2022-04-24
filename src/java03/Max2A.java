package java03;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		Scanner stdDouble = new Scanner(System.in);
		
		System.out.println("실수 a : ");
		double x = stdDouble.nextDouble();
		
		System.out.println("실수 b : ");
		double y = stdDouble.nextDouble();
		
		if(x > y) {
			System.out.println("큰값은 " + x);
		}else if(x < y) {
			System.out.println("큰값은 " + y);
		}else {
			System.out.println("a값과 b값이 같다");
		}
		
		
	}

}
