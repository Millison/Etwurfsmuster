package pattern.design.command;

public class KonkretesKommandoB implements Kommando {
	
	private EmpfaengerB empfaengerB;
	
	public KonkretesKommandoB(EmpfaengerB empfaengerB) {
		this.empfaengerB = empfaengerB;
	}

	@Override
	public void ausfuehren() {
		empfaengerB.aktionA();
		empfaengerB.aktionB();
	}

}
