package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

	@Test
	public void when00to20then2() {
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		double out = a.distance(b);
		int expected = 2;
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when22to24then2() {
		Point a = new Point(2, 2);
		Point b = new Point(2, 4);
		double out = a.distance(b);
		int expected = 2;
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void when24to64then4() {
		Point a = new Point(2, 4);
		Point b = new Point(6, 4);
		double out = a.distance(b);
		int expected = 4;
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void whenX2Y12toX4Y7then5Point39() {
		Point a = new Point(2, 12);
		Point b = new Point(4, 7);
		double out = a.distance(b);
		double expected = 5.39;
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void whenX2Y12Z3toX4Y7Z3then5Point48() {
		Point a = new Point(2, 12, 4);
		Point b = new Point(4, 7, 3);
		double out = a.distance3d(b);
		double expected = 5.48;
		Assert.assertEquals(expected, out, 0.01);
	}

	@Test
	public void whenX4Y23Z13toX6Y23Z8then5Point38() {
		Point a = new Point(4, 23, 13);
		Point b = new Point(6, 23, 8);
		double out = a.distance3d(b);
		double expected = 5.38;
		Assert.assertEquals(expected, out, 0.01);
	}

}