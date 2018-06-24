package pattern.design.observer;

public class Klient {

	public static void main(String[] args) {
		
		KonkreteSubjekt subjekt = new KonkreteSubjekt();
		subjekt.registrieren(new KonkreterBeobachterA());
		subjekt.registrieren(new KonkreterBeobachterB());
		
		subjekt.setStatus(5);
		subjekt.setStatus(32);
		
	}

}
