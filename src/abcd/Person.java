package abcd;

public class Person {
	private String name;
	private int age;
	private char sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public  void setSex(char sex) {
		this.sex = sex;
	}
	//判断是否是闰�?
	public void method1(int year){
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.println("是闰�?");
		}else{
			System.out.println("不是闰年");
		}
	}
	//计算�?个数的阶�?
	public long method2(int i){
		long result=i;
		for(int j=2;j<i;j++){
			result=result*j;
		}
		return result;
	}
	// 计算 1~100的质数和
	public int method3(){
		int result=0;
		for(int i=2;i<=100;i++){
			result+=method4(i);
		}
		return result;
	}
	// 判断�?个数 是否是质�? 如果�? 返回原数本身  如不是质数返�?0
	public int method4(int i){
		for(int j=2;j<i;j++){
			if(i%j==0){
				return 0;
			}
		}
		return i;
	}
	public static int add(int a,int b){
		int c=a+b;
		return c;
	}
}
