package java03;
import java.util.Scanner;

public class Quiz03_015 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("수를 입력하시오");
		int a = stdIn.nextInt();
		System.out.println("2nd수를 입력하시오");
		int b = stdIn.nextInt();
		
		if(a * a < b) {
			System.out.println("a는 b의 제곱근보다 작습니다");
		}else {
			System.out.println("a는 b의 제곱근보다 크다.");
		}
		
	}

}
