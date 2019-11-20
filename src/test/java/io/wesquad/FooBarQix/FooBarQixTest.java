package io.wesquad.FooBarQix;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FooBarQixTest {

	private FooBarQix fooBarQix = new FooBarQix();

	@Test
	public void should_return_Foo_when_divisable_by_3() {
		String result = fooBarQix.compute("9");
		assertThat(result, is("Foo"));
	}



	@Test
	public void should_return_Bar_when_divisable_by_7() {
		String result = fooBarQix.compute("14");
		assertThat(result, is("Qix"));
	}

	@Test
	public void should_return_FooBarQixStarBar_when_having_105() {
		String result = fooBarQix.compute("105");
		assertThat(result, is("FooBarQix*Bar"));
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
		String result = fooBarQix.compute("375");
		assertThat(result, is("FooBarFooQixBar"));
	}

	@Test(expected = NumberFormatException.class)
	public void should_throw_NumberFormatException_when_compute_have_a_nonNumber_param() {
		fooBarQix.compute("NaN");
	}
	
	@Test
	public void should_return_4_when_having_4() {
		String result = fooBarQix.compute("4");
		assertThat(result, is("4"));		
	}

	@Test
	public void should_return_1Star1_when_having_101(){
		String result = fooBarQix.compute("101");
		assertThat(result, is("1*1"));
	}
	
	@Test
	public void should_return_FooFooStarFoo_when_having_303(){
		String result = fooBarQix.compute("303");
		assertThat(result, is("FooFoo*Foo"));
	}
	
	@Test
	public void should_return_FooQixStarStar_when_having_10101(){
		String result = fooBarQix.compute("10101");
		assertThat(result, is("FooQix**"));
	}
}
