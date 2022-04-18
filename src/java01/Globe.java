package java01;

import java.util.Scanner;

public class Globe {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	final double PI = 3.1416;
		
	System.out.println("구의 겉넓이와 부피를 구합니다.");
	System.out.print("반지름 : ");
	double x = stdIn.nextDouble();
	
	System.out.println("겉넓이는 " + (4 * PI*x*x) + "이다.");
	System.out.println("부피는 " + (4/3.0*PI*x*x*x) + "이다.");
	
		
	}

}
