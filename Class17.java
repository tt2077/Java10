class Car 
{
	protected String owner;
	protected String id;
	
	public Car(String own, String s) { 	//(a)
		owner = own;
		id = s;
	}
	
	final void show()
	{
		System.out.println("���D�m�W"+owner);
		System.out.println("���P���X"+id);
	}
}
class CColor extends Car { 		//(b)
	public String color;
	public CColor(String own, String s, String col) {	//(c)
		super(own, s);
		color = col;
	}
	public void show_data() {
		System.out.println("���D�m�W"+owner);
		System.out.println("���P���X"+id);
		System.out.println("�����C��"+color);
	}
}

public class Class17 {

	public static void main(String[] args) {
		CColor mycar=new CColor("Riaan","A1-2345","Black");
		mycar.show_data();
	}

}
