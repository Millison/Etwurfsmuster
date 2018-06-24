package pattern.design.strategy;

/** Das Strategy Design Pattern ermöglicht einer Klasse das flexible Wechseln von alternativen Verhalten. **/

public class Klient {

	public static void main(String[] args) {
		
		Kontext situation = new Kontext();
		situation.ausfuehren();
		
		situation.setAktuelleStrategie(new KonkreteStrategieB());
		situation.ausfuehren();
	}

}
