public class Driver {
    public static void main(String[] args) {
	
	//initialization
	int i = 0; 

	//some sort of test
	while (i < 10) {
	   
	    System.out.println(i);
	    // System.out.print(i); prints all on same line
	  
	    //the increment
	    i = i + 1; 
	}
    }
}

/* Similar to recursion in that recursion needs base case + recursive case.
Also some cool syntax:
n += a       means       n = n + a
n++ and ++n  SORT OF mean n = n + 1
But this can become ambiguous such as in a+++b
So use the notation sparingly, and only when it's by itself to avoid confusion.

