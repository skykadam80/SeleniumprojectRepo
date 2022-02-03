package proDemo;

public class coreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mynum = 5;
		String website = "rahul shetty academy";
		char letter ='r';
		boolean mycard = true;
		double dec = 5.96;
		System.out.println(mynum+"is the value stored in the mynum");
		System.out.println(website);
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		int[] arr2 = {1,2,3,4,5,6,44,24,78,14};
		
		for(int i=0;i<arr2.length;i++)
		
		{
			
			System.out.println(arr2[i]);
		
		}
		String[] name ={"rahul","shetty","kadam"};
		for(int i=0;i<name.length;i++) 
		{
			System.out.println(name[i]);
		}
			for(String s: name)
			{
				System.out.println(s);
			}

	}
	
}

