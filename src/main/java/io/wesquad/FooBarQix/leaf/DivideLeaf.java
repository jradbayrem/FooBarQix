package io.wesquad.FooBarQix.leaf;

import io.wesquad.FooBarQix.component.IComputingComponent;

public class DivideLeaf implements IComputingComponent {

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
