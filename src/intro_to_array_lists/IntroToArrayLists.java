		package intro_to_array_lists;
		import java.util.ArrayList;
		public class IntroToArrayLists {
		public static void main(String[] args) {
		//1. Create an array list of Strings
		//Don't forget to import the ArrayList class
		ArrayList<String>name=new ArrayList<String>();
		//2. Add five Strings to your list
		name.add("Matthew");
		name.add("Ally");
		name.add("Patrick");
		name.add("Lance");
		name.add("Urusla");
		//3. Print all the Strings using a standard for-loop
		for(int i=0; i<name.size(); i++) {
		System.out.println(name.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String h: name) {
		System.out.println(h);
		}
		//5. Print only the even numbered elements in the list.
		for(int t=0; t<name.size(); t+=2) {
		System.out.println(name.get(t));
		}
		//6. Print all the Strings in reverse order.
		for(int j = name.size()-1; j>=0; j--) {
		System.out.println(name.get(j));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(String j:name) {
		if(j.contains("e")) {
		System.out.println(j);
		}
		}
		}
		}
