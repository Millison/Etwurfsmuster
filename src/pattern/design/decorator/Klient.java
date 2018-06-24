package pattern.design.decorator;

/** Das Decorator Design Pattern ermöglicht es, einem Objekt dynamisch neues Verhalten hinzuzufügen. **/

public class Klient {

	public static void main(String[] args) {
		Komponente kompA = new KonkreteKomponenteA();
		kompA.operation();
		
		kompA = new KonkreteDekoratorA(new KonkreteKomponenteA());
		kompA.operation();
		
		Komponente kompB = new KonkreteDekoratorC(new KonkreteDekoratorB(new KonkreteKomponenteB()));
		kompB.operation();
	}

}
