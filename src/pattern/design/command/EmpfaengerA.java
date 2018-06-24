package pattern.design.command;

public class EmpfaengerA implements Empfaenger {

	@Override
	public void aktionA() {
		System.out.println("Empfänger A. Aktion A.");
	}

	@Override
	public void aktionB() {
		System.out.println("Empfänger A. Aktion B.");
	}

}
