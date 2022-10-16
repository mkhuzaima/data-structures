import java.util.*; 

class list { 

	public static void main(String[] args) 
	{ 
        // Creating List 1
		List<Integer> l1 = new ArrayList<Integer>(); 

		l1.add(0, 1); 
		l1.add(1, 2); 

		System.out.print("Initial list 1 created: ");
		System.out.println(l1); 

		// Creating List 2
		List<Integer> l2 = new ArrayList<Integer>(); 

		l2.add(1); 
		l2.add(2); 
		l2.add(3); 

        System.out.print("Initial list 2 created: ");
		System.out.println(l2);

		// Add list l2 from 1 index 
		l1.addAll(1, l2); 
        System.out.print("\nAfter adding list 2 to list 1: ");
		System.out.println(l1); 

		// Removes element from index 1 
		l1.remove(1); 
        System.out.print("After removing index 1 from the final list: ");
		System.out.println(l1); 

        // Get element from list
		System.out.print("\nElement at index 3 is: : ");
		System.out.println(l1.get(3)); 

		// Update element to list
		l1.set(0, 5); 
        System.out.print("After Updating index 0 and setting it to 5 from the final list: ");
		System.out.println(l1); 
	} 
}

