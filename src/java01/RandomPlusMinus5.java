package java01;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int x = stdIn.nextInt();
		
		System.out.println("�Է°��� +-5������ ������ �����ض�");
		System.out.println("���� " + (x-5 + rand.nextInt(11)+ "�̴�."));  
	
	}

}
