package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


//class ConsImpl implements Consumer<Integer>
//{
//	public void accept(Integer i)
//	{
//		System.out.println(i);
//	}
//	
//}
public class DemoForEach {

	public static void main(String[] args) 
	{
		
			List<Integer> values = Arrays.asList(4,5,6,7,8);
			
		//	for(int i = 0;i<values.size();i++)
		//	{
		//		System.out.println(values.get(i));
		//	}
		//	for(int i : values)
		//	{
		//		System.out.println(i);
		//	}
		//	values.forEach(i -> System.out.println(i));//lambda exp
			//Consumer<Integer> c = i ->System.out.println(i);
//					new Consumer<Integer>()
//			{
//				   public void accept(Integer i) 
//				   {
//					   System.out.println(i);
//				   }
//			};
			values.forEach(i ->System.out.println(i) );
		}

}
