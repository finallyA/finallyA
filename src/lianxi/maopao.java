package lianxi;

public class maopao {
public static void main(String[] args) {
	int count=0;
	 int[] a={10,5,20,55,2,3,45,};
	     for(int i=0;i<a.length-1;i++){
	    	 for(int j=0;j<a.length-1-i;j++){
	    		 if(a[j]>a[j+1]){
	    			 int c=a[j];
	    			 a[j]=a[j+1];
	    			 a[j+1]=c;
	    		 }
	    	 }
	    	 count++;
	    	 for(int x:a){
	    		 System.out.print(x+"  ");
	    	 }
	    	  System.out.println();
	    	   System.out.println("--------------------------------------------");
	     }
	     System.out.println("一共循环了"+count+"次");
}
}
