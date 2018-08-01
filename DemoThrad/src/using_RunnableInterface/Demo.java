package using_RunnableInterface;

public class Demo implements Runnable {

	@Override
	public void run() {
System.out.println("thread start to run");		
	}
public static void main(String[] args) {
	Demo d=new Demo();
	Thread t=new Thread(d);
	t.start();
}
}
