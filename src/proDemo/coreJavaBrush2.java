package proDemo;

import java.util.ArrayList;

public class coreJavaBrush2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5,6,44,24,78,14};
		// 2,4,6,44,24,78,14
		
		for (int i=0;i<arr2.length;i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i]+"is not multiple by 2");
				
			}
		}
		ArrayList<String> a = new ArrayList<String>();
		// creat object of the class- object.method
		a.add("akash");
		a.add("rahul");
		a.add("kadam");
		a.add("seleium");
		System.out.println(a.get(3));
			

	}

}
