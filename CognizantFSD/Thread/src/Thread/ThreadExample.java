package Thread;

class MyThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<=10;i++)
		{
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				//e.printStackTrace();
			}
		}
		
	}
	
	
}


public class ThreadExample   {
	
	public static void main(String args[]) {
		
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t1.getState();
		t2.start();
		
	}

}
