package java03;
import java.util.Scanner;

public class Quiz03_014 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1st를 입력하시오");
		int a = stdIn.nextInt();
		System.out.println("2nd를 입력하시오");
		int b = stdIn.nextInt();
		System.out.println("3rd를 입력하시오");
		int c = stdIn.nextInt();
		
		
		if(a == b && b == c) {
			System.out.println("*");
		}else {
			System.out.println("a,b,c가 같지 않다");
		}
		
	}

}
