package using_threadClass;

public class Demo extends Thread{

	public void run()
	{
		System.out.println("thread is in running");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.start();
	}
}
