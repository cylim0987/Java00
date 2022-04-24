package java03;

import java.util.Scanner;

public class Season2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 월 입니까?");
		int x = stdIn.nextInt();
		
		switch(x) {
		case 3 :
		case 4 :
		case 5 : System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 : System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11 : System.out.println("가을");
			break;
		case 12 :
		case 1 :
		case 2 : System.out.println("겨울");
			break;
		default : System.out.println("잘못 입력하였음");
			break;
		}
	//default : 어떤 조건식에도 해당하지 않는 경우
	//switch문 내의 레이블 상용순서를 변경하면 실행 결과가 달라지니까 레이블 순서 고려해야함.
	}

}
