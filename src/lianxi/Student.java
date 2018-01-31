package lianxi;

public class Student {
	public sannianerban ss;
	public static Integer aaa;
	
	
	public sannianerban getSs() {
		return ss;
	}
	public void setSs(sannianerban ss) {
		this.ss = ss;
	}
	//代理模式
	public  void method(){
		ss.method();
		
	};
	public void getAge() {
	ss.getAge();
	}
	public static void sss(){
		System.out.println(aaa);
	}
}
