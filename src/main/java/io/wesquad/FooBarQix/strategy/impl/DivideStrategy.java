package io.wesquad.FooBarQix.strategy.impl;

import io.wesquad.FooBarQix.strategy.IComputingStrategy;

public class DivideStrategy implements IComputingStrategy {

	private StringBuilder computingResult;

	@Override
	public String compute(String paramToAnalyse) {
		this.computingResult = new StringBuilder();
		int transformedParam = Integer.parseInt(paramToAnalyse);

		if ((transformedParam % 3) == 0) {
			computingResult.append("Foo");
		}
		if ((transformedParam % 5) == 0) {
			computingResult.append("Bar");
		}
		if ((transformedParam % 7) == 0) {
			computingResult.append("Qix");
		}
		return computingResult.toString();
	}

}
