package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class test1 {
	private int input;
	private boolean expected;
	private lab1 b = null;
	
	public test1(int input, boolean expected){
		this.input = input;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		b = new lab1();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{1,true},
			{55,true},
			{40,false},
			{33,true}
		});
	}
	@Test
	public void testAdd(){
		assertEquals(this.expected, b.pay(input));
	}
	
}
