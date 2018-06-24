package pattern.design.command;

public class Klient {

	public static void main(String[] args) {
		
		Fragesteller frage = new Fragesteller();
		frage.setKommandoA(new KonkretesKommandoA(new EmpfaengerA()));
		frage.setKommandoB(new KonkretesKommandoB(new EmpfaengerB()));
		frage.tueKommandoA();
		frage.tueKommandoB();
	}

}
