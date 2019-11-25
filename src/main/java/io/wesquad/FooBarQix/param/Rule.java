package io.wesquad.FooBarQix.param;

public class Rule {

	public Rule(int number, String substitute) {
		super();
		this.number = number;
		this.substitute = substitute;
	}

	private int number;
	private String substitute;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSubstitute() {
		return substitute;
	}

	public void setSubstitute(String substitute) {
		this.substitute = substitute;
	}

}
