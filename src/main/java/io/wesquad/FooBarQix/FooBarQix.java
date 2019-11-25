package io.wesquad.FooBarQix;

import io.wesquad.FooBarQix.composite.ComputingComposite;
import io.wesquad.FooBarQix.leaf.ContainsLeaf;
import io.wesquad.FooBarQix.leaf.DivideLeaf;

public class FooBarQix {

	private ContainsLeaf containsLeaf;
	private DivideLeaf divideLeaf;
	private ComputingComposite computingComposite;

	public String compute(String paramToAnalyse) {

		this.containsLeaf = new ContainsLeaf();
		this.divideLeaf = new DivideLeaf();
		this.computingComposite = new ComputingComposite(divideLeaf, containsLeaf);
		return this.computingComposite.compute(paramToAnalyse);

	}

}
