package java03;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ : ");
		int x = stdIn.nextInt();

		if(x>0) {
			System.out.println("����Դϴ�");
		}else if(x == 0) {
			System.out.println("0�Դϴ�");
		}else if(x < 0){
			System.out.println("�����̴�.");
		}	
		
		/*
		}else{
			System.out.println("�����̴�.");
		}
		*/

	}

}
