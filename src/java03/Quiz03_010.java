package java03;

import java.util.Scanner;

public class Quiz03_010 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("수를 입력하시오");
		int m = stdIn.nextInt();
		
		switch(m % 3) {
		case 0 : System.out.println("3으로 나누어짐");
		break;
		case 1 : System.out.println("나머지 1이 남음");
		break;
		case 2 : System.out.println("나머지 2가 남음");
		break;
		
		
		}
		
	}

}
