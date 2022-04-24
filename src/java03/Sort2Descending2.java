package java03;

import java.util.Scanner;

public class Sort2Descending2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a: ");
		int a = stdIn.nextInt();
		
		System.out.println("정수 b: ");
		int b = stdIn.nextInt();
		
		if(a < b ) { //a가 b보다 작으면
			int t = a; //순서를 교환
			a = b;
			b = t;
		}
		System.out.println("a>=b가 되도록 정렬하였다.");
		System.out.println("변수 a는" + a + "이다.");
		System.out.println("변수 b는" + b + "이다.");
		
	}
	//a의 값이 b보다 작으면 a와 b의 값을 교환
	//a의 값이 b보다 크면 아무것도 하지않음(변경안함)
	
}
