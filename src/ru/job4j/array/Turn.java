package ru.job4j.array;

public class Turn {
	public static int[] back(int[] array) {
		int temp, indexLast;
		for (int i = 0; i < array.length; i++) {
			indexLast = array.length - i - 1;

			if (i == indexLast + 1 || i == indexLast) {
				break;
			} else {
				temp = array[i];
				array[i] = array[indexLast];
				array[indexLast] = temp;
			}
		}
		return array;
	}
}
