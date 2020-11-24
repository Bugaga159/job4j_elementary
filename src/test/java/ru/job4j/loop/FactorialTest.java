package test.java.ru.job4j.loop;

import org.junit.Test;
import test.java.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
	/**
	 * здесь тест, проверяющий, что факториал для числа 5 равен 120.
	 */
	@Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		int rsl = Factorial.calc(5);
		int expected = 120;
		assertThat(rsl, is(expected));
	}

	/**
	 * здесь тест, проверяющий, что факториал для числа 0 равен 1.
	 */
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		int rsl = Factorial.calc(0);
		int expected = 1;
		assertThat(rsl, is(expected));
	}
}