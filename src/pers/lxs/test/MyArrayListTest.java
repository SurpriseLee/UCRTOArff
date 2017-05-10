package pers.lxs.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++)
		{
			list.add(i);
		}
				
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			int element = it.next();
			System.out.print(element + ",");
		}
		
		System.out.println();
		
		list.add(5, 100);
		list.add(200);
		
		it = list.iterator();
		while(it.hasNext())
		{
			int element = it.next();
			System.out.print(element + ",");
		}
		
		System.out.println();
		
	}

}
