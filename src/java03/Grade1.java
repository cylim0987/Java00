package java03;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//����̾簡
		//100~91, 90~81, 80~71, 70~61, 60~0
		
		System.out.print("���� : ");
		int x = stdIn.nextInt();
		
		
		  if(x >= 0 && x <= 100) {
			if(x <= 60) {
				System.out.println("��");
			}
			else if(x >= 61 && x <= 70 ) {
				System.out.println("��");
			}
			else if(x >= 71 && x <= 80 ) {
				System.out.println("��");
			}
			else if(x >= 81 && x <= 90 ) {
				System.out.println("��");
			}
			else if(x >= 91 && x <= 100 ) {
				System.out.println("��");
			}
		  }
		  else {
		  System.out.println("�߸��� ���� �Է��Ͽ���.");
		  }
		}
		
	}


