package lianxi;


public class Action {
	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.setName("晓林");
		c1.setAction("边走猫步");
		Cat c2=new Cat();
		c2.setName("大胖");
		c2.setAction("边走猫步");
		Cat c3=new Cat();
		c3.setName("三胖");
		c3.setAction("边走猫步");
		Cat c4=new Cat();
		c4.method2(2.5f, 3.33f);
		c4.method2(10);
		
		c1.method();
		c1.method1();
		System.out.println(c1.getAction());
		c2.method();
		c2.method1();
		System.out.println(c2.getAction());
		c3.method();
		c3.method1();
		System.out.println(c3.getAction());
		
	}
	
	

}
