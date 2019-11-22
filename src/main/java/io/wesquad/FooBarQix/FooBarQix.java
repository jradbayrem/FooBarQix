package io.wesquad.FooBarQix;

import io.wesquad.FooBarQix.strategy.impl.ComputingStrategies;
import io.wesquad.FooBarQix.strategy.impl.ContainsStrategy;
import io.wesquad.FooBarQix.strategy.impl.DivideStrategy;

public class FooBarQix {

	private ContainsStrategy containsStrategy;
	private DivideStrategy divideStrategy;
	private ComputingStrategies computingStrategies;

	public String compute(String paramToAnalyse) {

		this.containsStrategy = new ContainsStrategy();
		this.divideStrategy = new DivideStrategy();
		this.computingStrategies = new ComputingStrategies(divideStrategy, containsStrategy);
		return this.computingStrategies.compute(paramToAnalyse);

	}

}
