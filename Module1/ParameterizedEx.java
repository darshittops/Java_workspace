
public class ParameterizedEx 
{
	//data members
	int id;
	String name;
	
	//constructor
	public ParameterizedEx(int id,String name) 
	{
			// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	//method
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	//main method
	public static void main(String[] args) 
	{
		
		//object
		ParameterizedEx p1 =new ParameterizedEx(101,"a1");
		ParameterizedEx p2 =new ParameterizedEx(102,"a2");
		
		/*System.out.println(p1.id+" "+p1.name);
		System.out.println(p2.id+" "+p2.name);*/
		
		//display data
		p1.display();
		p2.display();
		
	}
}
