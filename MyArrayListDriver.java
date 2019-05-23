import java.util.*;

public class MyArrayListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<String>list=new MyArrayList<String>(10);
		//String s2="I have not yet begun to fight";
		//for(int i=0;i<s2.length();i++)
		//{
			//list.add(""+s2.charAt(i));
		//}
		
		list.add("Abe");
		list.add("Sam");
		list.add("Joe");
		list.add("Jim");
		list.add("Sue");
		list.add("Les");
		list.add("Bill");
		list.add("Lori");
		list.add("Tammie");
		list.add("Don");
		System.out.println("\nPart 1");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("The Size Is " + list.size());
		System.out.println(list.indexOf("Bill"));
		System.out.println(list.indexOf("Christine"));
		
		System.out.println("\nPart 2");
		list.add("Maynard");
		list.add("Sauer");
		list.add("Snell");
		list.print();
		
		System.out.println("\npart3");
		list.add(2,"Bradshaw");
		list.add(4,"Brady");
		list.add(6,"Manning");
		list.add(8,"Unitas");
		list.print();
		
				
		System.out.println("\nPart4");
		System.out.println(list.remove("Les"));
		System.out.println(list.remove("Jon"));
		System.out.println(list.remove("Lori"));
		System.out.println(list.remove("Xavior"));
		list.print();
		
		System.out.println("\nPart5");
		System.out.println(list.remove(2));
		System.out.println(list.remove(4));
		System.out.println(list.remove(6));
		System.out.println(list.remove(8));
		list.print();
		
	}

}
