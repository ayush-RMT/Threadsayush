
public class ThreadAdder implements Runnable {
	MainThread ta;

	public ThreadAdder(MainThread mt) {
		this.ta = mt;

	}

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			ta.addlist(i);
		}
	}

}
