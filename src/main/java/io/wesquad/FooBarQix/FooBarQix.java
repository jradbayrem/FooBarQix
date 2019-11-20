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
				.filter(candidate -> (candidate == '3' || candidate == '5' || candidate == '7' || candidate == '0')).forEach(element -> {
					if (element == '3') {
						this.result.append("Foo");
					} else if (element == '5') {
						this.result.append("Bar");
					} else if (element == '7') {
						this.result.append("Qix");
					}else {
						this.result.append("0");
					}
				});

		if((this.result.length() == 0) || (this.result.length() == this.result.chars().filter(candidate -> candidate == '0').count())) {
			this.result = new StringBuilder().append(transformedParam);
		}
		return this.result.toString().replace('0', '*');
	}

	public StringBuilder getResult() {
		return result;
	}

	public void setResult(StringBuilder result) {
		this.result = result;
	}

}
