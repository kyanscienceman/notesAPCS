public class Ademo{
    public static void main(String[] args) {
	/*
	  Array - a pseudo class
	  Not really a class, def not a primitive, but acts like a class.
	  It's a continuous block of memory used to store multiple
	  values of a single data type.
	  
	*/

	//declare intArray to be of type "array of ints"
	int[] intArray;

	/* grab a block of memory big enough for 5 ints and return
	   a reference to that memory and store it in intArray
	*/
	intArray = new int[5];
	
	//declare stringArray to be of type "array of Strings"
	String[] stringArray;

	stringArray = new String[5];
	/*
	  allocate enough memory for 5 string and refer stringArray to 
	  the start of the block
	*/

	/* 
	   We access array elements with numeric indexing
	   a[0], a[1], etc.
	*/

	intArray[2] = 20;
	/*intArrray[7] = 30; returns an error when you try to run Driver
	because the index is out of bounds */

	stringArray[1] = "hello";

	/* When we make a new block of memory for an array, Java initializes
	   it with zeros or nulls.
	*/
	System.out.println(intArray.length);

	for (int i = 0 , i < intArray.length , i++){
	    System.out.println(intArray[i]+" ");
	}
	
	for (int i = 0 , i < intArray.length , i++){
	    System.out.println(intArray[i]+" ");
	}
	
	   
