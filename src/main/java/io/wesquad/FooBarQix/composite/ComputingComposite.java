package io.wesquad.FooBarQix.composite;

import java.util.Arrays;
import java.util.stream.Collectors;

import io.wesquad.FooBarQix.component.IComputingComponent;

public class ComputingComposite implements IComputingComponent {

	private IComputingComponent[] parametrizedCpuStrategies;

	public ComputingComposite(IComputingComponent... strategies) {
		this.parametrizedCpuStrategies = strategies;
	}

	@Override
	public String compute(String paramToAnalyse) {

		StringBuilder result = new StringBuilder(Arrays.stream(parametrizedCpuStrategies)
				.map(currentStrategy -> currentStrategy.compute(paramToAnalyse)).collect(Collectors.joining()));

		if ((result.length() == 0)
				|| (result.length() == result.chars().filter(candidate -> candidate == '0').count())) {
			result = new StringBuilder().append(paramToAnalyse);
		}

		return result.toString().replace('0', '*');

	}

}
