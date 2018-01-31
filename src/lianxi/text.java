package lianxi;

public class text {
public static void main(String[] args) {
//	Student s=new Student();
//	//多态的向上转型
//	
//	sannianerban lh=new Lh();
//	
//
//	s.setSs(lh);
//	s.getAge();
//	s.method();
//	//多态的向下转型
//    Lh bc=(Lh) lh;
//    bc.getAge();
    
//静态方法的调用
//Student.sss();
//s.sss();

//并发编程
//Thread t1=new Theard1();
//Thread t2=new Thread2();
Runnable r=new Thread3();
Thread t3=new Thread(r);
Thread t4=new Thread(r);
t3.start();
t4.start(); 


	

	

}
}
