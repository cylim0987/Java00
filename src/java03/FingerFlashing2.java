package java03;

import java.util.Random;

// 0, 1, 2 중 하나의 난수를 생성해서 0이면 '가위', 1이면 '바위', 2이면 '보'를 표시하는 프로그램을 작성.
public class FingerFlashing2 {
	public static void main(String[] args) {

		Random rand = new Random();
		
		System.out.print("컴퓨터가 낸 것 : ");
		int x = rand.nextInt(3);

		switch(x) {
		case 0: System.out.println("가위"); break;
		case 1: System.out.println("바위"); break;
		case 2: System.out.println("보"); break;
		
		}
		
		
		
		
		
	}

}
