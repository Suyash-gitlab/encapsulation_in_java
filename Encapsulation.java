package ArrayOOps_Encapsulation;

class info
	{
		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		private int sid;
		
		int disp()
		{
			return sid;
		}
		
	}
	public class Encapsulation 
	{

		public static void main(String[] args) 
		{

			info n=new info();
			n.setSid(101);
			int k=n.disp();
			System.out.println("Value o fsid isn:"+k);
			
			
		}

	}

