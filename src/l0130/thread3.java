package l0130;

public class thread3 implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<20;i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ÎÒÔçÉÏÔÙºÈ"+i);
		}
		
	}
}
