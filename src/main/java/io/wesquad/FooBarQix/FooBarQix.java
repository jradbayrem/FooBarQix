package io.wesquad.FooBarQix;

public class FooBarQix {
	
	
	public String compute(String paramToAnalyse) {
	
		int transformedParam = Integer.parseInt(paramToAnalyse);
		
		if((transformedParam % 3) == 0) {
			return "Foo";
		}
		
		return null;
	}
	
	


}
