package ru.job4j.array;

public class Turn {
	public static int[] back(int[] array) {
		int temp, indexLast;
		for (int i = 0; i < array.length / 2; i++) {
			indexLast = array.length - i - 1;
			temp = array[i];
			array[i] = array[indexLast];
			array[indexLast] = temp;
		}
		return array;
	}
}
