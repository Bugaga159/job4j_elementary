package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

	@Test
	public void whenArrayHas5Then0() {
		int[] input = {5, 4, 3, 2};
		int value = 5;
		int result = FindLoop.indexOf(input, value);
		int expect = 0;
		assertThat(result, is(expect));
	}

	@Test
	public void whenArrayHas6ThenMinus1() {
		int[] input = {9, 36, 4, 2};
		int value = 6;
		int result = FindLoop.indexOf(input, value);
		int expect = -1;
		assertThat(result, is(expect));
	}

	@Test
	public void whenArrayHas3Then2() {
		int[] input = {0, 6, 3, 3};
		int value = 3;
		int result = FindLoop.indexOf(input, value);
		int expect = 2;
		assertThat(result, is(expect));
	}

	@Test
	public void whenArrayHas34Then5() {
		int[] input = {35, 6, 3, 3, 63, 34};
		int value = 34;
		int result = FindLoop.indexOf(input, value);
		int expect = 5;
		assertThat(result, is(expect));
	}
}