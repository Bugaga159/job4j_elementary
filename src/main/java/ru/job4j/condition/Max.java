package test.java.job4j.condition;

public class Max {
	public static int max(int left, int right) {
		boolean max = left >= right;
		int result = max ? left : right;
		return result;
	}

	public static int max(int first, int second, int third) {
		return max(first, max(second, third));
	}

	public static int max(int first, int second, int third, int fourth) {
		return max(max(first, second), max(third, fourth));
	}
}
