package io.wesquad.FooBarQix;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FooBarQixTest {
	
	private FooBarQix fooBarQix = new FooBarQix();
	
	@Test
	public void should_return_Foo_when_divisable_by_3()
	{
		String result = fooBarQix.compute("9");
		assertThat(result, is("Foo"));
	}
	
	@Test
	public void should_return_Bar_when_divisable_by_5() {
		String result = fooBarQix.compute("10");
		assertThat(result, is("Bar"));

	}
	
	@Test
	public void should_return_Bar_when_divisable_by_7() {
		String result = fooBarQix.compute("14");
		assertThat(result, is("Qix"));
	}
}
