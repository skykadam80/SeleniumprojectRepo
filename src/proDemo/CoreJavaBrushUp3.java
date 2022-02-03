package proDemo;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string is an object // String literal
		
		//String s1 = "rahul shetty Academy";
		String s5 = "hello";
		
		//new
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		String s = "rahul shetty Academy";
		//String[] splittedString = s.split(" "); space define
		String[] splittedString = s.split("shetty");
	    System.out.println(splittedString[0]);
	    System.out.println(splittedString[1]);
	    //System.out.println(splittedString[2]);
	    System.out.println(splittedString[1].trim());
	    // for(int i=0; i<s.length(); i++)
	    // reverse side
	    for(int i=s.length()-1;i>0;i--)
	    	 
	    {
	     System.out.println(s.charAt(i));
	    }
	}

}
