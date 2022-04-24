package java03;

import java.util.Scanner;

public class Quiz03_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("'월'을 입력하시오");
		int m = stdIn.nextInt();
		
		if(!(m<3 || m>5)) {
			System.out.println("봄입니다.");
		}else {
			System.out.println("봄이 아닙니다");
		}
		
	}

}
