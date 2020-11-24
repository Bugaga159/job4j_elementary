package test.java.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import test.java.job4j.condition.SqArea;

public class SqAreaTest {

	@Test
	public void square() {
		int expected = 2;
		int p = 6;
		int k = 2;
		double out = SqArea.square(p, k);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void whenP34K5Then40Point14() {
		double expected = 40.14;
		int p = 34;
		int k = 5;
		double out = SqArea.square(p, k);
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void whenP25K3Then29Point3() {
		double expected = 29.3;
		int p = 25;
		int k = 3;
		double out = SqArea.square(p, k);
		Assert.assertEquals(expected, out, 0.01);
	}

}