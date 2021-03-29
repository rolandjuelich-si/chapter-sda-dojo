package de.signaliduna.chapter.sda.dojo;

public class FooBarQix {

    private Divisibility divisibility;
    private Occurrence occurrence;

    public FooBarQix(Divisibility divisibility) {
        this.divisibility = divisibility;
    }

    public FooBarQix() {
		// TODO Auto-generated constructor stub
    	
	}

	public FooBarQix(Occurrence occurrence) {
        this.occurrence = occurrence;
    }

public FooBarQix(Divisibility divisibility2, Occurrence occurrence2) {
	   this.divisibility = divisibility2;
	   this.occurrence = occurrence2;
	}

public String compute(final String givenNumber) {
        if (occurrence != null) {
          return occurrence.compute(givenNumber);
        }
        if (divisibility != null) {
          return divisibility.compute(givenNumber);
        }
        return null;
    }
}
