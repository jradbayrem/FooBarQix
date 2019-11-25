package io.wesquad.FooBarQix.leaf;

import io.wesquad.FooBarQix.component.IComputingComponent;
import io.wesquad.FooBarQix.param.Rule;

public class ContainsLeaf implements IComputingComponent {

	private StringBuilder computingResult;
	private Rule[] rules;

	public ContainsLeaf(Rule[] rules) {
		this.rules = rules;
	}

	@Override
	public String compute(String paramToAnalyse) {
		this.computingResult = new StringBuilder();
		paramToAnalyse.chars().mapToObj(subject -> (char) subject).forEach(candidate -> {
			for (Rule rule : rules) {
				if (Character.getNumericValue(candidate) == rule.getNumber()) {
					this.computingResult.append(rule.getSubstitute());

				} else if (Character.getNumericValue(candidate) == 0) {
					this.computingResult.append("0");
					break;
				}
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
