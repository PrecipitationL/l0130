package l0130;

public class thread_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a=new thread1();
		Thread b=new thread2();
		
		thread3 t3 = new thread3();
		
		Thread c = new Thread(t3);
		
		a.start();
		b.start();
		c.start();
		

	}

}
