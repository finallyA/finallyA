package lianxi;

public class Thread3 implements Runnable {
	   int count=10;
	public synchronized void xiaoshou(){
		 if (count == 0){  
			   System.out.println("Ʊ�Ѿ�������");
			 } 
           System.out.println(Thread.currentThread().getName()+"�����˵�"+count+"��Ʊ");
		    count--;
		    try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
			while(count>0){
				
			xiaoshou();
			}
		}
	}

