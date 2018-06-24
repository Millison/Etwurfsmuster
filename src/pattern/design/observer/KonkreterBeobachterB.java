package pattern.design.observer;

public class KonkreterBeobachterB implements Beobachter {

	@Override
	public void update(int status) {
		System.out.println("Beobachter B bekommt neuer Status: " + status);
	}

}
