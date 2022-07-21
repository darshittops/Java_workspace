
public class StaticVariable 
{
	static int count=0;
	
	public StaticVariable() 
	{
		// TODO Auto-generated constructor stub
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		StaticVariable s1 =new StaticVariable();
		StaticVariable s2 =new StaticVariable();
		StaticVariable s3 =new StaticVariable();
	}
}
