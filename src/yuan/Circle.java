package yuan;

public class Circle {
   Point o;
   double radius;
   public Circle(Point _o,double r){
	   o=_o;
	   radius=r;
   }
   public Circle(double r){
	   radius=r;
	   o=new Point(0.0,0.0);
   }
   boolean contains(Point point){
	   return false;
   }
   public double area(){
	   return 3.14*radius*radius;
   }
   public Point getO(){
	   return o;
   }
   public void setO(Point _o){
	   o=_o;
   }
   public double  getRadius(){
		return radius;
	}
	public void setRadius(double r ){
		radius=r;
	}
}
