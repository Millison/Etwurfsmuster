package pattern.design.observer;

public class KonkreterBeobachterA implements Beobachter {

	@Override
	public void update(int status) {
		System.out.println("Beobachter A bekommt neuer Status: " + status);
	}

}
