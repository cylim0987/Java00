package java03;

import java.util.Scanner;

public class Absolute1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int x = stdIn.nextInt();
		
		if(x >= 0) { 
			System.out.println("���밪�� " + x + "�̴�. ");
		}
		else {
			System.out.println("���밪�� " + -x + "�̴�. ");
		}
	}

}
