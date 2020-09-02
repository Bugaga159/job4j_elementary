package ru.job4j.condition;

public class Max {
	public static int max(int left, int right) {
		if (left == right) {
			return left;
		}

		boolean max = left > right;
		int result = max ? left : right;
		return result;
	}
}
