package xiaozuoye;

import java.util.Scanner;

public class huiwen {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 while(true){ System.out.println("������һ��5λ�������س�����");
	 int q=sc.nextInt();
	
	
	int s=q/10000;
	int d=(q%10000)/1000;
	int f=(q%1000)/100;
	int g=(q%100)/10;
	int h=q%10;
	int[] x={s,d,f,g,h};
	int count=0;
	for(int i=0;i<x.length-1;i++){
		if((x.length%2)!=0 &&	x[i]==x[x.length-1-i]){
			count++;
			continue;
		
		}else{
			
			System.out.println(q+"���ǻ�����");
			break;
		}
	
		}
	if(count>1&&count<5){
		System.out.println(q+"�ǻ�����");

	}
	

	
		
		
	}
}
}
