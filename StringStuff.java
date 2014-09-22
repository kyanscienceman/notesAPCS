public class StringStuff {
    public void test1(){
	String s1 = "hello";
	String s2 = "hello";
	String s3 = new String("hello");
	String s4 = new String("hello");
	System.out.println("s1==s2: "+(s1 == s2));
	System.out.println("s1==s3: "+(s1 == s3));
	System.out.println("s1==s4: "+(s1 == s4));
	System.out.println("s2==s3: "+(s2 == s3));
	System.out.println("s2==s4: "+(s2 == s4));
	System.out.println("s3==s4: "+(s3 == s4));
	// System.out.println("s1==s2: "+s1 == s2);
	// System.out.println("s1==s3: "+s1 == s3);
	// System.out.println("s1==s4: "+s1 == s4);
	// System.out.println("s2==s3: "+s2 == s3);
	// System.out.println("s2==s4: "+s2 == s4);
	// System.out.println("s3==s4: "+s3 == s4);
	/* Without parentheses they are all false for reasons.*/

/* This prints out TFFFFF. Because s1 and s2 refer to a place in the memory 
that stores a string "hello". Since you're not making a new string, it will 
refer to the same location.
When the program starts, Java makes a string literal in a location because it
sees that we need one. And if that string is required again, Java will check for
it and use one already made, if possible. */

/* == comapres memory addresses.
   s.equals(s2) compares what the strings represent.
   s.compareTo(s2) returns 0 if s has value equal to s2's, returns negative if
   s < s2, returns positive if s > s2. 
*/
	System.out.println();
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));

	System.out.println();
	System.out.println("aaa".compareTo("aaa"));
	System.out.println("abc".comapreTo("aaa"));
	System.out.println("aaa".compareTo("abc"));
	System.out.println("aaa".compareTo("AAA"));
	System.out.println("AAAAA".compareTo("ADAAA"));
	System.out.println("aaaaaaaaaaaaaaaaaa".compareTo("aaa"));
	//The reason why they are greater/less than each other is because of the ASCII values of the characters. 
	//compareTo gives us the difference between the values, which is why the positive/negative number varies so much. 
	//The number of characters (in the last case) also matters.

	System.out.println("Hello world".indexOf(" "));
    }
}
