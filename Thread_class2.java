package multithreading;
class Thread_2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
public class Thread_class2 {
	public static void main(String[] args) {
		//make thread class
		Thread_2 t= new Thread_2();
		Thread th=new Thread(t);
		th.start();
	}

}
