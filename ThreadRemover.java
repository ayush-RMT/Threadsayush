
public class ThreadRemover implements Runnable {
	MainThread rt;

	public ThreadRemover(MainThread mt) {
		this.rt = mt;
	}

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			rt.removelist();
		}

	}

}
