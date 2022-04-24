package java03;

import java.util.Scanner;

public class Quiz03_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("입력");
		int w = stdIn.nextInt();
		
		switch(w) {
		case 0 : System.out.println("맑음");
			break;
		case 1 : System.out.println("비");
			break;
		case 2 : System.out.println("구름");
			break;
		default : System.out.println("재입력하시오");
		}
		
	}

}
