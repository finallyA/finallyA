package he;

public class zhishu {
 
	  public int i1(){
		  int sum=0;
		  for(int i=2;i<=100;i++){
			  sum=sum+l2(i);
		  }
		  return sum;
		  
	  }
      public int l2(int i){
    	  for(int j=2;j<i;j++){
    		  if(i%j==0){
    			  return 0;
    		  }
    		  
    	  }
    	  return i;
    	  
      }	  

	      public static void main(String[] args){
	    	  zhishu i2=new zhishu();
	    	 int s= i2.i1( );
	    	 System.out.println(s);
	    	  
	    	  
	      }
	  
  }

