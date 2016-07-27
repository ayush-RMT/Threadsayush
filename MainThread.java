import java.util.ArrayList;
import java.util.List;

public class MainThread {
	List<Integer> list = new ArrayList<Integer>();

	public synchronized void addlist(int num) {
		list.add(num);
		System.out.println(list);
		notify();
	}

	public synchronized void removelist() {
		if (list.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			list.remove(0);
			System.out.println(list);
			//notify();
		}
	}

	public static void main(String[] args) {
		MainThread mainthread=new MainThread();
		ThreadAdder threadadder=new ThreadAdder(mainthread);
		ThreadRemover threadremover=new ThreadRemover(mainthread);
		Thread thread1=new Thread(threadadder);
		Thread thread2=new Thread(threadremover);
		thread1.start();
		thread2.start();
	}

}
