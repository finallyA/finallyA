package lianxi;

public class text {
public static void main(String[] args) {
//	Student s=new Student();
//	//��̬������ת��
//	
//	sannianerban lh=new Lh();
//	
//
//	s.setSs(lh);
//	s.getAge();
//	s.method();
//	//��̬������ת��
//    Lh bc=(Lh) lh;
//    bc.getAge();
    
//��̬�����ĵ���
//Student.sss();
//s.sss();

//�������
//Thread t1=new Theard1();
//Thread t2=new Thread2();
Runnable r=new Thread3();
Thread t3=new Thread(r);
Thread t4=new Thread(r);
t3.start();
t4.start(); 


	

	

}
}
