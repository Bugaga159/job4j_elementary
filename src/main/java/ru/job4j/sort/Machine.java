package test.java.job4j.sort;

import java.util.Arrays;

public class Machine {
	private static final int[] COINS = {10, 5, 2, 1};

	public int[] change(int money, int price) {
		int result = money - price;
		int[] rsl = new int[100];
		int size = 0;
		for (int i = 0; i < COINS.length; i++) {
			while (result >= COINS[i]) {
				result -= COINS[i];
				rsl[size] = COINS[i];
				size++;
			}
		}
		return Arrays.copyOf(rsl, size);
	}
}
