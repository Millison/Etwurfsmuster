package pattern.design.strategy;

public class Kontext {
	
	private Strategie aktuelleStrategie = new KonkreteStrategieA();
	
	public void ausfuehren() {
		aktuelleStrategie.ausfuehrbareStrategie();
	}
	
	public Strategie getAktuelleStrategie() {
		return aktuelleStrategie;
	}

	public void setAktuelleStrategie(Strategie neueStrategie) {
		this.aktuelleStrategie = neueStrategie;
	}

}
