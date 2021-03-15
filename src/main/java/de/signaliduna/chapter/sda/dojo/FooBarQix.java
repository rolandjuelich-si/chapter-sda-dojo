package de.signaliduna.chapter.sda.dojo;

public class FooBarQix {

    Divisibility divisibility;

    public FooBarQix(Divisibility divisibility) {
        this.divisibility = divisibility;
    }

    public FooBarQix() {
		// TODO Auto-generated constructor stub
    	
	}

	public String compute(final String givenNumber) {
		return divisibility.compute(givenNumber);
    }
}
