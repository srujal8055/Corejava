package multithreading;
class table{
	
	synchronized void table_mul(int num) {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(num*i);
		}
	}
}
class Thread_p extends Thread{
	table t;
	public Thread_p(table t)
	{
		this.t=t;
	}
public void run() {
	t.table_mul(5);
}
}
class Thread_p1 extends Thread{
	table t;
	public Thread_p1(table t)
	{
		this.t=t;
	}
	public void run() {
		t.table_mul(2);
	}
	
}
public class Synchrinized_keyword {
	public static void main(String[] args) {
		table t=new table();
		Thread_p th=new Thread_p(t);
		Thread_p1 th2=new Thread_p1(t);
		th.start();
		th2.start();
	}

}
