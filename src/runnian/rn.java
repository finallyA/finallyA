package runnian;

import java.util.Scanner;

public class rn {
         public static int s;
	     public static void main(String[] args){
	    	 rn x=new rn();
	    	 
	    	  int	  year;
	    	 Scanner in = new Scanner(System.in);
	    	
	    	 while (true) {
	    		 System.out.println("�����벢���س�����");
	    		 year=in.nextInt();
	             
	         	if((year%4==0&&year%100!=0)||year%400==0){
					System.out.println("������");
				}else{
					System.out.println("��������");
				}
	         }
	    
	         
			
			
				   
			}
			
		}

