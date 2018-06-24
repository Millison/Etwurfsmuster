package pattern.design.decorator;

/** Dekorator ist eine Unterklasse von Komponente **/

public abstract class Dekorator extends Komponente {
	
	protected Komponente komponente;
	
	public Dekorator(Komponente komponente) {
		this.komponente = komponente;
	}
}

/** Es werden drei Unterklassen von Dekorator benötigt **/

class KonkreteDekoratorA extends Dekorator {
	
	public KonkreteDekoratorA(Komponente komponente) {
		super(komponente);
	}
	
	public void operation() {
		komponente.operation();
		System.out.println("Mit konkrete Dekorator A");
	}
}

class KonkreteDekoratorB extends Dekorator {
	
	private int neueStatus;
	
	public KonkreteDekoratorB(Komponente komponente) {
		super(komponente);
		neueStatus = 9;
	}
	
	public void operation() {
		komponente.operation();
		System.out.println("Mit konkrete Dekorator B und dem Status = " + neueStatus);
	}
}

class KonkreteDekoratorC extends Dekorator {
	
	public KonkreteDekoratorC(Komponente komponente) {
		super(komponente);
	}
	
	public int neueOperation() {
		return 5;
	}
	
	public void operation() {
		System.out.println("Mit konkrete Dekorator C und eine neue Operation/Funktionalität = " + neueOperation());
	}
}