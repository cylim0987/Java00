package java03;

import java.util.Random;

// 0, 1, 2 중 하나의 난수를 생성해서 0이면 '가위', 1이면 '바위', 2이면 '보'를 표시하는 프로그램을 작성.
public class FingerFlashing {
	public static void main(String[] args) {

		Random rand = new Random();
		
		System.out.print("컴퓨터가 낸 것 : ");
		int x = rand.nextInt(3);

		if(x == 0) {
			System.out.println("가위");
		}else if(x == 1){
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
		
		
		
		
	}

}
