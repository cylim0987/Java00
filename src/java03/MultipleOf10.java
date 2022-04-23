package java03;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
	
	//if와 else if else의 자리를 확실하게 잡아주던가 {}로 묶기
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값: ");
		int x = stdIn.nextInt();
	if(x > 0) {
		
		if(x%10 == 0) { 
			System.out.println("이 값은 10의 배수이다");
		}else { 
		System.out.println("이 값은 10의 배수가 아니다.");
		}
	}
	else if (x == 0){ 
		System.out.println("정수값을 0으로 입력하였음. ");
	}else {
		System.out.println("정수값을 음수로 입력함.");
	}
		/* 안된다 이러면 위쪽에서 걸어줘야 함
		}else if(x == 0) {
			System.out.println("0의 값을 입력하였음");
		*/	
	}
		
}


