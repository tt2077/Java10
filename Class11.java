class CShape	//父類別CShape
{
	public double area()
	{
		return 0.0;
	}
}
class CCircle extends CShape {
	double radius ;	
	public CCircle(double r) {
		radius=r;
	}
	public double area() {		//(a)
		return (3.14*radius*radius);
	}
}
class CSquare extends CShape { 		//(b)
	double side;
	public CSquare(double s) {
		side=s;
	}
	public double area() {
		return (side*side);
	}
}
class CTriangle  extends CShape {		//(c)
	double base, height;
	public CTriangle(double b, double h) {
	base=b; 
	height=h;
}
	public double area() {
		return (base*height/2);
	}
}
public class Class11 {

	public static void main(String[] args) {
		CCircle cir1=new CCircle(2.0); 		//(d)
		CCircle cir2=new CCircle(4.0);
		CSquare squ1=new CSquare(2.0);
		CSquare squ2=new CSquare(4.0);
		CTriangle tril1=new CTriangle(4,8);
		CTriangle tril2=new CTriangle(6,10);
		double a[]=new double[6];
		
		System.out.println("Circle(2.0)="+cir1.area());
		System.out.println("Circle(4.0)="+cir2.area());
		System.out.println("Square(2.0)="+squ1.area());
		System.out.println("Square(4.0)="+squ2.area());
		System.out.println("Triangle(4,8)="+tril1.area());
		System.out.println("Triangle(6,10)="+tril2.area());
		
		a[0]=cir1.area();
		a[1]=cir2.area();
		a[2]=squ1.area();
		a[3]=squ2.area();
		a[4]=tril1.area();
		a[5]=tril2.area();
		System.out.println("最大面積="+largest(a));
	}
	public static double largest(double a[]) {	//(e)
		double max=a[0];
		for(int i=0;i<=a.length;i++)
			if(max<a[i])
				max=a[i];
		return max;
	}

}
