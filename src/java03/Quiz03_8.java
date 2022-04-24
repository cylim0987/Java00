package java03;

import java.util.Scanner;

public class Quiz03_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("수를 입력하시오");
		int m = stdIn.nextInt();
		
		if(m % 3 == 0) {
			System.out.println("3으로 나누어짐");
		}else if(m%3==1){
			System.out.println("3으로 나눈 나머지는 1");
		}else {
			System.out.println("3으로 나눈 나머지는 2");
		}
		
	}

}
