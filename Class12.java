class CShape	
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
	public double area() {		
		return (3.14*radius*radius);
	}
}
class CSquare extends CShape { 		
	double side;
	public CSquare(double s) {
		side=s;
	}
	public double area() {
		return (side*side);
	}
}
class CTriangle  extends CShape {		
	double base, height;
	public CTriangle(double b, double h) {
	base=b; 
	height=h;
}
	public double area() {
		return (base*height/2);
	}
}
public class Class12 {

	public static void main(String[] args) {
		CShsape shp[]=new CShape[6];
		shp[0]=new CCircle(2.0); 		
		shp[1]=new CCircle(4.0);
		shp[2]=new CSquare(2.0);
		shp[3]=new CSquare(4.0);
		shp[4]=new CTriangle(4,8);
		shp[5]=new CTriangle(6,10);
		for(int i=0;i<shp.length;i++)
		System.out.println("area of shp["+i+"]="+shp[i].area());
		System.out.println("³Ì¤j­±¿n="+largest(shp));
	}
	public static double largest(CShape a[]) {	//(e)
		double max=a[0].area();
		for(int i=0;i<=a.length;i++)
			if(max<a[i].area())
				max=a[i].area();
		return max;
	}

}
