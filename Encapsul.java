package ArrayOOps_Encapsulation;

abstract class xyz
{
	abstract void get();
	
}



 class Ab extends xyz
 {
	 void get() 
		{
		int a=10,b=30,c;
		c=a+b;
		System.out.println(c);
		}

	public static void main(String[] args) 
	{
		Ab x=new Ab();
		x.get();
		
	}
		
	
	
 }
 

