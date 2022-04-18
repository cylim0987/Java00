package java01;

import java.util.Random;

public class RandomInteger {
	public static void main(String[] args) {

		Random rand = new Random();
		
		int x = 1 + rand.nextInt(9); // (1 ~ 9)
		int y = -1 - rand.nextInt(9); // (-1 ~ -9)
		int z = 10 + rand.nextInt(90); //(10 ~ 99)
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
	}

}
