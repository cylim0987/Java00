package java03;

import java.util.Scanner;

public class Med3 {
//중앙값 구하는 건 어렵네
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 a : ");
		int a = stdIn.nextInt();
		
		System.out.println("정수값 b : ");
		int b = stdIn.nextInt();
		
		System.out.println("정수값 c : ");
		int c = stdIn.nextInt();
		
		
		int med;
		if(a >= b) {
			if(b >= c) {
				med = b;
			}
			else if (a <= c) {
				med = a;
			}
			else {
				med = c;
			}
		}
		else if(a > c) {
			med = a;
		}
		else if(b > c) {
			med = c;
		}
		else {
			med = b;
		}
		System.out.println("중앙값은 " + med + "");
	}

}
