package java03;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� �� �Դϱ�?");
		int x = stdIn.nextInt();
		
		if(x>2 && x<6) {
			System.out.println("��");
		}else if(x>5 && x<9) {
			System.out.println("����");
		}else if(x>8 && x<12) {
			System.out.println("����");
		}else if(x>11 && x<3){
			System.out.println("�ܿ�");
		}else {
			System.out.println("�߸��Է�");
		}

		
	}

}
