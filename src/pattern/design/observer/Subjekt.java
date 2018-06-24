package pattern.design.observer;

import java.util.ArrayList;

/** Abstract nur damit man die Instanz nicht erzeugen konnte **/

public abstract class Subjekt {
	
	private final ArrayList<Beobachter> beobachterListe = new ArrayList<Beobachter>();
	
	public void registrieren(Beobachter beobachter) {
		this.beobachterListe.add(beobachter);
	}
	
	public void entfernen(Beobachter beobachter) {
		this.beobachterListe.remove(beobachter);
	}
	
	protected void benachrichtigen(int status) {
		for (Beobachter beobachter: beobachterListe) {
			beobachter.update(status);
		}
	}
}
