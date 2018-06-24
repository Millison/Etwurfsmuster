package pattern.design.observer;

public class KonkreteSubjekt extends Subjekt {
	
	private int status;

	public void setStatus(int status) {
		this.status = status;
		benachrichtigen(status);
	}
	
	public int getStatus() {
		return this.status;
	}

}
