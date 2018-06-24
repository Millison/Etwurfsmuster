package pattern.design.command;

public class EmpfaengerB implements Empfaenger {

	@Override
	public void aktionA() {
		System.out.println("Empfänger B. Aktion A.");
	}

	@Override
	public void aktionB() {
		System.out.println("Empfänger B. Aktion B.");
	}

}
