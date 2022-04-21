package java01;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {

		Scanner stringName = new Scanner(System.in);
		
		System.out.println("º∫: ");
		String x = stringName.next();

		System.out.println("¿Ã∏ß: ");
		String y = stringName.next();
		
		System.out.println("æ»≥Á«œººø‰. " + (x+y) + "ææ.");
		
	}

}
