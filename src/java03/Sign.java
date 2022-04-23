package java03;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		int x = stdIn.nextInt();

		if(x>0) {
			System.out.println("양수입니다");
		}else if(x == 0) {
			System.out.println("0입니다");
		}else if(x < 0){
			System.out.println("음수이다.");
		}	
		
		/*
		}else{
			System.out.println("음수이다.");
		}
		*/

	}

}
