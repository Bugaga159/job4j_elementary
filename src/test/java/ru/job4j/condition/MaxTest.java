package test.java.ru.job4j.condition;

import org.junit.Test;
import test.java.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
	@Test
	public void whenMax1To2Then2() {
		int result = Max.max(1, 2);
		assertThat(result, is(2));
	}

	@Test
	public void whenMax6To12Then12() {
		int result = Max.max(6, 12);
		assertThat(result, is(12));
	}

	@Test
	public void whenMax2To2Then2() {
		int result = Max.max(2, 2);
		assertThat(result, is(2));
	}

	@Test
	public void whenMax10To2Then10() {
		int result = Max.max(10, 2);
		assertThat(result, is(10));
	}

	@Test
	public void when3numbersThen16() {
		int result = Max.max(10, 2, 16);
		assertThat(result, is(16));
	}

	@Test
	public void when4numbersThen34() {
		int result = Max.max(9, 12, 34, 28);
		assertThat(result, is(34));
	}
}