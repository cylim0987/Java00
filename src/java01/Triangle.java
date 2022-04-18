package java01;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("삼각형의 넓이를 구합니다.");
		
		System.out.println("밑변 : ");
		double x = stdIn.nextDouble();

		System.out.println("높이 : ");
		double y = stdIn.nextDouble();
		
		System.out.println("넓이는 : " + ((x*y)/2));
		
		
	}

}
