package pattern.design.command;

public class Fragesteller {
	
	private Kommando kommandoA;
	private Kommando kommandoB;
	
	public void tueKommandoA() {
		kommandoA.ausfuehren();
	}
	
	public void tueKommandoB() {
		kommandoB.ausfuehren();
	}
	
	public void setKommandoA(Kommando kommandoA) {
		this.kommandoA = kommandoA;
	}
	
	public void setKommandoB(Kommando kommandoB) {
		this.kommandoB = kommandoB;
	}
	
}
