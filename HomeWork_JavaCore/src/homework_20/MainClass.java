package homework_20;

public class MainClass {

	public static void main(String[] args)throws InterruptedException {
		MyThread myThread = new MyThread();
		Thread runnableThread = new Thread(new RunnableThread());
		myThread.start();
		runnableThread.start();
		
	}

}
