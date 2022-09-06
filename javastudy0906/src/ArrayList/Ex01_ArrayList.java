package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		int [] arr = new int[5];
		
		ArrayList<Integer> arrList  = new ArrayList<Integer>();
		
		arrList.add(1);
		System.out.println(arrList.size());
		System.out.println(arrList.get(0));
		
		List<Integer> arrList2= new ArrayList<Integer>();
		
		arrList2.add(1);
		arrList2.add(2);
		arrList2.add(3);
		arrList2.add(4);
		arrList2.add(5);
		System.out.println(arrList2.size());
		System.out.println(arrList2.get(2));
		System.out.println(arrList2.contains(3));
		System.out.println(arrList2.indexOf(3));
	}

}
