package lianxi;

public class Thread2 extends Thread {
	public void run(){
	
		for(int i=1;i<10;i++){
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("hl"+i);
		}
	}

}
