package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class MultipleSwitchWeekTest {

	@Test
	public void when3dayRUThen3() {
		int result = MultipleSwitchWeek.numberOfDay("Среда");
		assertThat(result, is(3));
	}

	@Test
	public void when2dayENThen2() {
		int result = MultipleSwitchWeek.numberOfDay("Tuesday");
		assertThat(result, is(2));
	}

	@Test
	public void whenOtherDayThenMinus1() {
		int result = MultipleSwitchWeek.numberOfDay("Tuesdays");
		assertThat(result, is(-1));
	}
}