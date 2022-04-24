package java03;

import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a: ");
		int x = stdIn.nextInt();
		
		System.out.println("정수 b: ");
		int y = stdIn.nextInt();
		
		System.out.println("정수 c: ");
		int z = stdIn.nextInt();
		
		int min = x;
		
		if(y<min) {
			min = y;
		}
		if(z<min) {
			min = z;
		}
		
		System.out.println("최소값은 " + min + "이다.");
		
	}

	//'알고리즘' : 문제를 해결하기 위한 것으로, 명확하게 정의되어 있으며 순서가 정해져 있는 유한 개의 규칙들의 집합...
}
