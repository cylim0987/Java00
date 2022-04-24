package java03;

import java.util.Scanner;

public class Max2A_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수 a : ");
		double x = stdIn.nextDouble();
		
		System.out.println("실수 b : ");
		double y = stdIn.nextDouble();
		
		double max;
		
		if(x > y) {
			max = x;
		}else {
			max = y;
		}
		
		System.out.println("큰 값은" + max);
	}

}
