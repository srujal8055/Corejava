package multithreading;

public class thread_1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
public class Thread_join{
	public static void main(String[] args) throws InterruptedException {

		thread_1 th=new thread_1();thread_1 th1=new thread_1();thread_1 th2=new thread_1();
		
		
		th.start();
		th.join();
		th1.start();
		th1.join();
		th2.start();
	}
}
