package test.java.ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;
import test.java.job4j.calculate.X2;

public class X2Test {
	/**
	 * Тесты
	 * Входные параметры. Их будет 4 штуки
	 * Ожидаемое значение -  Это всегда одна переменная
	 * Происходит вызов метода, который хотим проверить.
	 * Сохраняем результат вычисления. Это всегда одна переменная
	 * И сравнение полученного значения с ожидаемым
	 */
	@Test
	public void whenA10B9C0X2Then40() {
		int a = 10;
		int b = 0;
		int c = 0;
		int x = 2;
		int expected = 40;
		int rsl = X2.calc(a, b, c, x);
		Assert.assertEquals(expected, rsl);
	}

	@Test
	public void whenA1B1C1X1Then3() {
		int a = 1;
		int b = 1;
		int c = 1;
		int x = 1;
		int expected = 3;
		int rsl = X2.calc(a, b, c, x);
		Assert.assertEquals(expected, rsl);
	}

	@Test
	public void whenA0B1C1X1Then2() {
		int a = 0;
		int b = 1;
		int c = 1;
		int x = 1;
		int expected = 2;
		int rsl = X2.calc(a, b, c, x);
		Assert.assertEquals(expected, rsl);
	}

	@Test
	public void whenA1B1C0X1Then2() {
		int a = 1;
		int b = 1;
		int c = 0;
		int x = 1;
		int expected = 2;
		int rsl = X2.calc(a, b, c, x);
		Assert.assertEquals(expected, rsl);
	}

	@Test
	public void whenA1B1C1X0Then1() {
		int a = 1;
		int b = 1;
		int c = 1;
		int x = 0;
		int expected = 1;
		int rsl = X2.calc(a, b, c, x);
		Assert.assertEquals(expected, rsl);
	}
}