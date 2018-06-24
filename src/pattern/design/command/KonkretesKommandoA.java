package pattern.design.command;

public class KonkretesKommandoA implements Kommando {
	
	private EmpfaengerA empfaengerA;
	
	public KonkretesKommandoA(EmpfaengerA empfaengerA) {
		this.empfaengerA = empfaengerA;
	}

	@Override
	public void ausfuehren() {
		empfaengerA.aktionA();
		empfaengerA.aktionB();
	}

}
