package multithreading;


class Thread_one extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
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
public class Thread_create {
	public static void main(String[] args) {
		Thread_one th=new Thread_one();
				th.start();
	}

}
