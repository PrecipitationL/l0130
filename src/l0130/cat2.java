package l0130;

public class cat2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=1;j<10;j++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("аЁДа"+j);
		}
	}
}
