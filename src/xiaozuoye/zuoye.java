package xiaozuoye;

public class zuoye {
public static void main(String[] args){
	int a=5678;
	int s=a/1000;
	int d=(a%1000)/100;
	int f=(a%100)/10;
	int g=a%10;
	int x=g*1000+f*100+d*10+s;
	System.out.println(x);
	
}
}
