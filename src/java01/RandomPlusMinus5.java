package java01;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값: ");
		int x = stdIn.nextInt();
		
		System.out.println("입력값의 +-5범위의 난수를 생성해라");
		System.out.println("값은 " + (x-5 + rand.nextInt(11)+ "이다."));  
	
	}

}
