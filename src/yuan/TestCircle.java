package yuan;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point o=new Point(1.0,2.0);
		Circle c1=new Circle(o,2.0);
		Circle c2=new Circle(5.0);
		System.out.println("c1:圆心 x="+c1.getO().getX()+" y="+c1.getO().getY()+" radius="+c1.getRadius());
		System.out.println("c2:圆心 x="+c2.getO().getX()+" y="+c2.getO().getY()+" radius="+c2.getRadius());
		 System.out.println("c1的面积="+c1.area());
		 System.out.println("c2的面积="+c2.area());
		 c1.setO(new Point(3.0,4.0));
		 c2.setRadius(9.0);
		  System.out.println("c1：圆心 x="+c1.getO().getX()+" y="+c1.getO().getY()+" radius="+c1.getRadius());
		 System.out.println("c2：圆心 x="+c2.getO().getX()+" y="+c2.getO().getY()+" radius="+c2.getRadius());
		 System.out.println("c1的面积="+c1.area());
		 System.out.println("c2的面积="+c2.area());

	}

}
