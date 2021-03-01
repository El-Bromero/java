package java_1.collections;

import java.util.*;

public class CollectionsChallenges {

	public static void main(String[] args) {
//		Complete the code challenges for the following static methods
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,3,5,10,15,20,30));
		System.out.println("findVal intList: " + intList);
		System.out.println("findVal: " + findVal(10, intList) + "\n");

		String[] stringArr = {"hi", "hello", "howdy", "yo"};
		System.out.println("String array: " + Arrays.toString(stringArr));
		System.out.println("String list: " + convertArrToList(stringArr) + "\n");

		ArrayList<String> usStates = new ArrayList<>(Arrays.asList("TX", "CA", "FL", "NY", "AZ", "KS", "OK", "AK"));
		System.out.println("US List: " + usStates);
		System.out.println("US Set: " + listToSet(usStates) + "\n");

		System.out.println("Number is being added to list: " + addToList(100, intList));
		System.out.println(intList + "\n");

		System.out.println("Number is being removed to list: " );
		removeFromList(30, intList);
		System.out.println(intList + "\n");

		System.out.println("numList before insert: " + intList);
		System.out.println("Number being inserted into list: " + insertIntoList(1000, 100, intList));
		System.out.println("numList after insert: " + intList + "\n");

		reverseNums(intList);

		LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red","orange","yellow","green","blue","indigo","violet"));
		System.out.println("Linked list before reverse: " + linkedList);
		System.out.println("Linked list after reverse (true mutate): " + reverseLinkedList(linkedList, true));
		System.out.println("Linked list after reverse (false mutate): " + reverseLinkedList(linkedList, false) + "\n");

		ArrayList<String> duplicateStringList = new ArrayList<String>(Arrays.asList("hi", "hello", "hi", "howdy", "yo", "yo", "what up"));
		System.out.println("Removing duplicates: " + removeDuplicates(duplicateStringList));
	}


	static int findVal(int val, ArrayList<Integer> arrList) {
//		find a value in the input array list.  return it if found.  If not, return 0.
		for(Integer i : arrList)
		{
			if (val == i)
			{
				return val;
			}
		}
		return 0;
	}

	static List convertArrToList(Object[] array) {
//		convert the array to a list and return it.
		List<Object> objectList = Arrays.asList(array);
		return objectList;
	}

	static Set<String> listToSet(List<String> states) {
//		convert a list of US states to a set.  return the set.
		Set<String> usStateSet = new HashSet<>();
		for(String i : states)
		{
			usStateSet.add(i);
		}
		return usStateSet;
	}

	static int addToList(int x, ArrayList<Integer> numList) {
		// add the x input to the array list.  return the value if succcessfully added.
		// Add x value to numList. If it is added successfully then return x else return -1
		numList.add(x);
		if(numList.get(numList.size()-1) == x)
		{
			return x;
		}
		return -1;
	}

	static void removeFromList(int x, ArrayList<Integer> numList) {
		// remove the input parameter value x from the numList.
		for (int i = 0; i < numList.size(); i++)
		{
			if(numList.get(i) == x)
			{
				numList.remove(i);
			}
		}
	}

	static int insertIntoList(int x, int i, ArrayList<Integer> numList) {
		// insert the the value x at index position i for the input numList.  If the index position is outside the bounds of the current numList, add it to the end of the array list.
		// Try and catch the adding of x in index i. If error happens (out of bounds) then just use x in add()
		try
		{
			numList.add(i, x);
		}
		catch (Exception e)
		{
			numList.add(x);
		}
		return x;
	}

	static List<Integer> reverseNums(ArrayList<Integer> nums) {
		/*
		reverse the values of the nums list
		return the reversed array list.
		*/
		System.out.println("List before reverse: " + nums);
		Collections.reverse(nums);
		System.out.println("List after reverse: " + nums + "\n");
		return nums;
	}

	static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList, boolean mutate) {

/*		reverse the linked list.  If the mutate boolean is set to true, reverse a copy of the linked list without mutating the original list.  If mutate is false, reverse the original linkedList in place.
		example : ["red","orange","yellow","green","blue","indigo","violet"] => reverseLinkedList => [violet, indigo, blue, green, yellow, orange, red]
 */
		// If mutate then "reverse" the copy linked list
		LinkedList<String> copyLinkedList = new LinkedList<>();
		if(mutate)
		{
			for(String i : linkedList)
			{
				copyLinkedList.addFirst(i);
			}
			return copyLinkedList;
		}
		// If false then modify linkedList (original)
		else
		{
			for(String i : linkedList)
			{
				copyLinkedList.addLast(i);
			}
			int index = 0;
			for (int i = copyLinkedList.size()-1; i >= 0; i--)
			{
				linkedList.set(index, copyLinkedList.get(i));
				index++;
			}
			return linkedList;
		}
	}

	static ArrayList<String> removeDuplicates(ArrayList<String> names) {
//		remove duplicates from the list of name strings.  return a new array list with the unique elements.
		System.out.println("Before removing dups: " + names);
		for (int i = 0; i < names.size(); i++)
		{
			for(int j = i + 1; j < names.size(); j++)
			{
				if(names.get(i) == names.get(j))
				{
					names.remove(j);
				}
			}
		}
		return names;
	}

	static class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

	//Optional
	static Queue<Person> covidVaccineQueue(Person[] people) {
//		There is an Array of people looking to get the COVID-19 vaccine.  The vaccines are administered on a first-come, first-serve basis.  Sequence the order of people by age.  The most elderly people get placed first in the queue, with the youngest getting placed last in the queue.  Return the Queue of folks waiting to be vaccinated.

		return null;
	}

}
