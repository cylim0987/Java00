package java01;

import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		double x = rand.nextDouble();
		double y = rand.nextDouble() * 10;
		double z = -1 + 2 * rand.nextDouble();
		
		
		
		System.out.println("0.0�̻� 1.0�̸� : " + x);
		System.out.println("0.0�̻� 10.0�̸� : " + y);
		System.out.println("-1.0�̻� 1.0�̸� : " + z);
		
	}

}
