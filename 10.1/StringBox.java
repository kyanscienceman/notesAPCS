public class StringBox {

    public String box(int r, int c) {
	String s = "";
	int a = c * r;
	while (r > 0) {
	    while (a > 0) {
		if (a % (c + 1) != 0) {
		    s = s + "*";
		}
		else {
		    s = s + "\n";
		}
		a = a - 1;
	    }
	    r = r - 1;
	}
	return s;
    }
	
}

/* Today we learn how to work in 2-D space. This typically requires 2 loops.
Here's Mr.Z's code:

String s = "";
int rc = 0;
while (rc < r) {
      int cc = 0;
      while (cc < r) {
      s += "*";
      cc += 1;
      }
      s = s + "\n";
      rc ++;
}
return s;
*/
