package ArrayOOps_Encapsulation;
import java.util.*;
class model
{
	int id;
	String cname;
	int Price;
	String model;
	
	public model(int id,String cname,int Price, String model)
	{
		this.id=id;
		this.cname=cname;
		this.Price=Price;
		this.model=model;
	}
	
	void disp()
	{
		System.out.println("Model :"+model);
		System.out.println("Car name is :"+cname);
		System.out.println("Price is :"+Price);
	}
}

class brand
{
	model m;
	String bname;
	int dateofmod;
	String add;
	
	public brand(String bname,int dateofmod,String add,model m)
	{
		this.bname=bname;
		this.dateofmod=dateofmod;
		this.add=add;
		this.m=m;
	}
	
	void display()
	{
		System.out.println("The name of Car Brand is :"+bname);
		System.out.println("Modification date is :"+dateofmod);
		System.out.println("Assemble in :"+add);
		m.disp();
	
	}	
}


public class Association 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values :");
		String bname=sc.next();

		model m = new model(1,"car",2004,"retro");
		brand c=new brand(bname,2024,"Pune",m);
		c.display();
		

	}

}

