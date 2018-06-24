package ModelViewController;

import java.util.Timer;
import java.util.TimerTask;

public class Model {

	View vi = new View();

	private int second = 0;
	private Timer timer;

	public void start() {
		if (timer == null) {
			timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					second += 1;
					vi.getTime(second);
				}
			}, 0, 1000);
		}
	}
	
	public void clear() {
		second = 0;
	}
}
