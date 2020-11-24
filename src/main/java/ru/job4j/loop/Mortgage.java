package test.java.job4j.loop;

public class Mortgage {
	public static double getSumWithPercent(double amount, double percent) {
		return amount + (amount * percent / 100);
	}

	public static int year(int amount, int salary, double percent) {
		int year = 1;
		double firstYear = getSumWithPercent((double) amount, percent);
		while (firstYear > salary) {
			year++;
			firstYear = getSumWithPercent(firstYear, percent) - salary;
		}
		return year;
	}
}
