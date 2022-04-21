package java01;

import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		double x = rand.nextDouble();
		double y = rand.nextDouble() * 10;
		double z = -1 + 2 * rand.nextDouble();
		
		
		
		System.out.println("0.0이상 1.0미만 : " + x);
		System.out.println("0.0이상 10.0미만 : " + y);
		System.out.println("-1.0이상 1.0미만 : " + z);
		
	}

}
