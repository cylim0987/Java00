package java03;

import java.util.Scanner;

//3개의 정수값을 오름차순(작은 순)으로 정렬하는 프로그램 작성

//실패
public class Sort3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a: ");
		int a = stdIn.nextInt();
		System.out.println("정수 b: ");
		int b = stdIn.nextInt();
		System.out.println("정수 c: ");
		int c = stdIn.nextInt();
		
		if(a > b) { //a가b보다 크면...
			int t = a;
			a = b;
			b = t;
			if(b > c) {
				int q = b;
				b = c;
				c = q;
				System.out.println("a<=b<=c가 되도록 정렬.");
				System.out.println("변수는 a는" + a);
				System.out.println("변수는 b는" + b);
				System.out.println("변수는 c는" + c);
			}
			
		}
		
		
	}

}
