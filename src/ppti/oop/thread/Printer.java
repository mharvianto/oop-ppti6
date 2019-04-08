package ppti.oop.thread;

public class Printer implements Runnable {

	private String type = "";
	private int count = 0;

	public Printer(String type, int count) {
		this.type = type;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.println(type + " printing page " + (i + 1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
