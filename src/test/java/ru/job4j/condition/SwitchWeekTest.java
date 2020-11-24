package test.java.ru.job4j.condition;

import org.junit.Test;
import test.java.job4j.condition.SwitchWeek;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchWeekTest {

	@Test
	public void day1Test() {
		String day = SwitchWeek.nameOfDay(1);
		assertThat(day, is("Понедельник"));
	}

	@Test
	public void day2Test() {
		String day = SwitchWeek.nameOfDay(2);
		assertThat(day, is("Вторник"));
	}

	@Test
	public void day3Test() {
		String day = SwitchWeek.nameOfDay(3);
		assertThat(day, is("Среда"));
	}

	@Test
	public void day4Test() {
		String day = SwitchWeek.nameOfDay(4);
		assertThat(day, is("Четверг"));
	}

	@Test
	public void day5Test() {
		String day = SwitchWeek.nameOfDay(5);
		assertThat(day, is("Пятница"));
	}

	@Test
	public void day6Test() {
		String day = SwitchWeek.nameOfDay(6);
		assertThat(day, is("Суббота"));
	}

	@Test
	public void day7Test() {
		String day = SwitchWeek.nameOfDay(7);
		assertThat(day, is("Воскресенье"));
	}

	@Test
	public void day8Test() {
		String day = SwitchWeek.nameOfDay(8);
		assertThat(day, is("Ошибка"));
	}

}