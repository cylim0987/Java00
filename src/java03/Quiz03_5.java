package java03;

import java.util.Scanner;

public class Quiz03_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("첫번째 변수 입력");
		int x = stdIn.nextInt();
		System.out.println("두번째 변수 입력");
		int y = stdIn.nextInt();
		
		System.out.println("x와 y 중 작은 값은 " + (x<y ? x:y));
		System.out.println("x와 y 중 큰 값은 " + (x>y ? x:y ));
		
		
	}

}
