import java.util.List;
import java.util.ArrayList;

public class Final{

    public void Q1(){
	int n = 2013;
	for(int i = 0 ; i < 42 ; i++)
	    n = (n+5)/3;
	System.out.println(n);
    }

    // 2018
    // 672 R2 n = 672
    // 677 / 3 = R2
    

    public void Q3(){
	List nums = new ArrayList<Integer>(3);
	nums.add(new Integer(1));
	nums.add(new Integer(2));
	nums.add(0,nums.get(1));

	Object x = nums.get(0);
	Object y = nums.get(1);
	if(x == y)
	    System.out.println(x + " is equal to " + y);
	else
	    System.out.println(x + " is NOT equal to " + y);

    }

    public void Q4(){
	List cities = new ArrayList();
	cities.add("Atlanta");
	cities.add("Boston");
	for(int i = 1 ; i < cities.size() ; i++){
	    cities.add(i,"+");
	    System.out.println(cities);
	}
    }

    /*-------------------------- Main -------------------------*/
    
    public static void main(String[] args){
	Final f = new Final();
	//f.Q1();
	//f.Q3();
	//f.Q4();
	//System.out.println("1" + new Integer(2) + 3);
	boolean a = false;
	boolean b = true;
	System.out.println( (!a && b) == !(a || b) );
    }
    
}
