package io.wesquad.FooBarQix.leaf;

import io.wesquad.FooBarQix.component.IComputingComponent;

public class ContainsLeaf implements IComputingComponent {

	private StringBuilder computingResult;
	

	@Override
	public String compute(String paramToAnalyse) {
		this.computingResult = new StringBuilder();

		paramToAnalyse.chars().mapToObj(subject -> (char) subject)
				.filter(candidate -> (candidate == '3' || candidate == '5' || candidate == '7' || candidate == '0'))
				.forEach(element -> {
					if (element == '3') {
						this.computingResult.append("Foo");
					} else if (element == '5') {
						this.computingResult.append("Bar");
					} else if (element == '7') {
						this.computingResult.append("Qix");
					} else {
						this.computingResult.append("0");
					}
				});


		return computingResult.toString();
	}

}
