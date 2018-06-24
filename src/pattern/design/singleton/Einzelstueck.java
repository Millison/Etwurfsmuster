package pattern.design.singleton;

public class Einzelstueck {
	
	private static Einzelstueck einzeln;
	
	private Einzelstueck() {
	}
	
	public static Einzelstueck getInstanz() {
		if (einzeln == null) {
			einzeln = new Einzelstueck();
		}
		return einzeln;
	}
	
	public void instanzTest() {
		System.out.println("Weil es 'static' ist, kann aufgerufen werden, ohne eine Instanz zu erzeugen.");
	}
}
