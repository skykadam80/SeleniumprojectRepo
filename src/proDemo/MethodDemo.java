package proDemo;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d= new MethodDemo();
		String name = d.getData();
		System.out.println(name);
		//call another class method
		MethodDemo2 d1 = new MethodDemo2();
		System.out.println(d1.getUserData());
		getData2();
			
		
     // #why method
	}
		
	//public void getData()
	public String getData()
	{
		//System.out.println("hello word");
		System.out.println("hello word");
		return "rahul shetty";
	}
	public static String getData2() 
	{
		System.out.println("hello word");
		return "rahul shetty";
	}
		
	

}
