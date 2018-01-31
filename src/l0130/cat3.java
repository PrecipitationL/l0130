package l0130;

public class cat3 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int a=1;a<10;a++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Õº½´"+a);
			
		}
	}

}
