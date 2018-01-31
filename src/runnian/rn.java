package runnian;

import java.util.Scanner;

public class rn {
         public static int s;
	     public static void main(String[] args){
	    	 rn x=new rn();
	    	 
	    	  int	  year;
	    	 Scanner in = new Scanner(System.in);
	    	
	    	 while (true) {
	    		 System.out.println("请输入并按回车键：");
	    		 year=in.nextInt();
	             
	         	if((year%4==0&&year%100!=0)||year%400==0){
					System.out.println("是闰年");
				}else{
					System.out.println("不是闰年");
				}
	         }
	    
	         
			
			
				   
			}
			
		}

