package xiaozuoye;

public class gongyueshu {
public static void main(String[] args) {
	    int n=24;
	    int m=20;
	    int k = 0;
	    int z=m*n;
        // 使n>m
        if (n < m)
        {
            int t = 0;
            t = n;
            n = m;
            m = t;
        }
        // 直到余数为0
        while (m != 0)
        {
            k = n % m;
            n = m;
            m = k;
        }
        int x=n;
        System.out.println("最大公约数："+x);
        int r=z/x;
        System.out.println("最小公倍数："+r);
        
        

	    	}


	  
	        }
	   
	       

