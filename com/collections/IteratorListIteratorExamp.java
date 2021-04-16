package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class IteratorListIteratorExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list2 = Arrays.asList(1,2,3,4,56,7);
		List<Integer> list3 = Stream.of(1,2,3,4,5,6);
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Iterator itr = list.iterator();
		
        System.out.println("Iterator:");
        System.out.println("Forward traversal: ");

        while(itr.hasNext()) {
        		
            System.out.print(itr.next() + " ");
            
            

        }
        System.out.println();
        System.out.println("ListIterator:");
        System.out.println("Forward Traversal : ");
        
        ListIterator litr = list.listIterator();
        System.out.println();

        while(litr.hasNext())
        System.out.println(litr.next());

        System.out.println();
        
        while(litr.hasPrevious())
        System.out.println(litr.previous());
        
        
        
	}

}
