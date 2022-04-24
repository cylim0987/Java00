package java03;
//여기 다시 볼 것
import java.util.Scanner;

public class Quiz03_012 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("수를 입력하시오");
		int n = stdIn.nextInt();
		
		switch(n) {
		case 1 : System.out.print("A");
		case 2 : System.out.print("B");
			break;
		default : System.out.print("C");
		}
		// 1 : AB
		// 2 : B
		// 그외 : C
	}

}
