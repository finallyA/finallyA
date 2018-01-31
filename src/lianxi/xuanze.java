package lianxi;

public class xuanze {
 public static void main(String[] args){
	    
	     int[] a={5,10,15,20,64,90,45,35,120,110,119,};
	     int count=0;
	       for(int i=0;i<a.length-1;i++){
	    	   int k=i;
	    	   for(int j=1;j<a.length-i;j++){
	    	    	 if(a[k]<a[k+j]){
	    	    		 int e=a[k+j];
	    	    		  a[k+j]=a[k];
	    	    		  a[k]=e;
	    	    		 }
	    	   }
	    	   for(int c : a ){
	    		   System.out.print (c+"  ");
	    	   }
	    	   count++;
	    	   System.out.println();
	    	   System.out.println("--------------------------------------------");
	    	   
	    	   
	       }
	 System.out.println("一共循环了"+count+"次");
 }

}
