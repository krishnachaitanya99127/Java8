package com.java8;

interface A
{
	void show();
}
//class Xyz implements A{
	
	//public void show()
	//{
	//	System.out.println("hello");
	//}
//}

public class LambdaDemo {

	public static void main(String[] args) 
	{
		A obj;
		//obj = new A()
		
		//{
		//	public void show()
		//	{
		//		System.out.println("hello");
		//	}
		//};
		obj = () ->
		{
			System.out.println("hello");
		};
		
		obj.show();
		
	}

}
