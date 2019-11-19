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

	@Test
	public void should_return_FooBarQix_when_having_105() {
		String result = fooBarQix.compute("105");
		assertThat(result, is("FooBarQixBar"));
	}
	
	@Test
	public void should_return_FooFoo_when_having_3() {
		String result = fooBarQix.compute("3");
		assertThat(result, is("FooFoo"));

	}

	@Test
	public void should_return_BarBar_when_having_5() {
		String result = fooBarQix.compute("5");
		assertThat(result, is("BarBar"));

	}
	
	@Test
	public void should_return_QixQix_when_having_7() {
		String result = fooBarQix.compute("7");
		assertThat(result, is("QixQix"));

	}
	
	@Test
	public void should_return_FooBarQixFooBar_when_having_315() {
		String result = fooBarQix.compute("315");
		assertThat(result, is("FooBarQixFooBar"));
	}
	
	@Test
	public void should_return_FooBarFooQixBar_when_having_375() {
		String result = fooBarQix.compute("315");
		assertThat(result, is("FooBarFooQixBar"));
	}
	
}
