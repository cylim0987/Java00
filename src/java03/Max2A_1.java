package java03;

import java.util.Scanner;

public class Max2A_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수 a : ");
		double x = stdIn.nextDouble();
		
		System.out.println("실수 b : ");
		double y = stdIn.nextDouble();
		
		double max;
		
		if(x > y) {
			max = x;
			System.out.println("큰 값은 " + max);
		}else if(x < y) {
			max = y;
		}else {
			System.out.println("값이 같다");
		}
	//	System.out.println("큰 값은 " + max);
	//  ???????????????
		
	}

}
