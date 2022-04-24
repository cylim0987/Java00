package java03;
//여기 다시 볼 것
import java.util.Scanner;

public class Quiz03_011 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("수를 입력하시오");
		int m = stdIn.nextInt();
		System.out.println("두번째 수를 입력하시오");
		int n = stdIn.nextInt();

		if(m > n) {
			int t = m;
			m = n;
			n = t;
		}
		System.out.println("m=<n이 되도록 정렬하였다.");
		System.out.println("변수 m는" + m + "이다.");
		System.out.println("변수 n는" + n + "이다.");
		
	}

}
