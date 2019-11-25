package io.wesquad.FooBarQix.leaf;

import java.util.Arrays;

import io.wesquad.FooBarQix.component.IComputingComponent;
import io.wesquad.FooBarQix.param.Rule;

public class DivideLeaf implements IComputingComponent {

	private StringBuilder computingResult;

	private Rule[] rules;

	public DivideLeaf(Rule... rules) {
		this.rules = rules;
	}

	@Override
	public String compute(String paramToAnalyse) {
		this.computingResult = new StringBuilder();
		int transformedParam = Integer.parseInt(paramToAnalyse);

		Arrays.stream(rules).forEach(rule -> {
			if ((transformedParam % rule.getNumber()) == 0) {
				computingResult.append(rule.getSubstitute());
			}
		});

		return computingResult.toString();
	}

	public Rule[] getRules() {
		return rules;
	}

	public void setRules(Rule[] rules) {
		this.rules = rules;
	}

}
