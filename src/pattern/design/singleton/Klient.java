package pattern.design.singleton;

public class Klient {

	public static void main(String[] args) {
		
		Einzelstueck singletone = Einzelstueck.getInstanz();
		singletone.instanzTest();
		
	}
}
