package java03;
import java.util.Scanner;
//다시보기
public class Quiz03_016 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a : ");
		int a = stdIn.nextInt();
		System.out.println("b : ");
		int b = stdIn.nextInt();
		int c = 0;
		
		if(a%2==0) {
			c = c+1;
		}
		if(b%2==0) {
			c = c+1;
		}
		if(c==0) {
			System.out.println("양쪽 모두 홀수다.");
		}
		else if(c==1) {
			System.out.println("한쪽만 홀수다");
		}
		else if(c==2) {
			System.out.println("양쪽 모두 짝수다.");
		}

	}

}
