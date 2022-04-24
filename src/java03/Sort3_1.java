package java03;

import java.util.Scanner;
//3개의 정수값을 오름차순(작은 순)으로 정렬하는 프로그램 작성
public class Sort3_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a: ");
		int a = stdIn.nextInt();
		System.out.println("정수 b: ");
		int b = stdIn.nextInt();
		System.out.println("정수 c: ");
		int c = stdIn.nextInt();
		
		if(a > b) { //a가b보다 크면...a와 b를 교환
			int t = a;
			a = b;
			b = t;
		}
		if(b > c) {
			int t = b;
			b = c;
			c = t;
		}
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		
		System.out.println("a<=b<=c가 되도록 정렬.");
		System.out.println("변수는 a는" + a);
		System.out.println("변수는 b는" + b);
		System.out.println("변수는 c는" + c);
			
		
		
	}

}
