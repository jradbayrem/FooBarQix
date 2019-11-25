package io.wesquad.FooBarQix;

import io.wesquad.FooBarQix.composite.ComputingComposite;
import io.wesquad.FooBarQix.leaf.ContainsLeaf;
import io.wesquad.FooBarQix.leaf.DivideLeaf;
import io.wesquad.FooBarQix.param.Rule;

public class FooBarQix {

	private ContainsLeaf containsLeaf;
	private DivideLeaf divideLeaf;
	private ComputingComposite computingComposite;

	public String compute(String paramToAnalyse) {

		Rule foo = new Rule(3, "Foo");
		Rule bar = new Rule(5, "Bar");
		Rule qix = new Rule(7, "Qix");

		this.containsLeaf = new ContainsLeaf(foo, bar, qix);
		this.divideLeaf = new DivideLeaf(foo, bar, qix);
		this.computingComposite = new ComputingComposite(divideLeaf, containsLeaf);
		return this.computingComposite.compute(paramToAnalyse);

	}

}
