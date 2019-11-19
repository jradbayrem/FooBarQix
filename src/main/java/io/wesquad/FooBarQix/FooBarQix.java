package io.wesquad.FooBarQix;

public class FooBarQix {

	public FooBarQix() {
		this.result = new StringBuilder();
	}

	private StringBuilder result;

	public String compute(String paramToAnalyse) {

		int transformedParam = Integer.parseInt(paramToAnalyse);

		if ((transformedParam % 3) == 0) {
			this.result.append("Foo");
		}
		if ((transformedParam % 5) == 0) {
			this.result.append("Bar");
		}
		if ((transformedParam % 7) == 0) {
			this.result.append("Qix");
		}

		paramToAnalyse.chars().mapToObj(subject -> (char) subject)
				.filter(candidate -> (candidate == '3' || candidate == '5' || candidate == '7')).forEach(element -> {
					if (element == '3') {
						this.result.append("Foo");
					} else if (element == '5') {
						this.result.append("Bar");
					} else if (element == '7') {
						this.result.append("Qix");
					}
				});

		return this.result.toString();
	}

	public StringBuilder getResult() {
		return result;
	}

	public void setResult(StringBuilder result) {
		this.result = result;
	}

}
