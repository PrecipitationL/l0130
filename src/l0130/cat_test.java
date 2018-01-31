package l0130;

public class cat_test {
	public static void main(String[]args) {
		Thread b=new cat1();
		Thread c=new cat2();
		cat3 d=new cat3();
		Thread e=new Thread(d);
		  
		b.start();
		c.start();
		e.start();
		
	}

}
