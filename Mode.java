import java.io.*;
import java.util.*;

public class Mode {

    /*----------- Instance Variables --------*/
    int[] a;
    Random r;

		
    /*----------- Constructors --------*/
    public Mode() {
	this(20,100);
    }

    public Mode(int n) {
	this(n,100);
    }

    /*
      n - size of the array
      m - max value for each element
    */
    public Mode(int n,int m){
	r = new Random();
	a = new int[n];
	for (int i=0;i<n;i++){
	    a[i] = r.nextInt(m);
	}
    }


    public int mode(){
	int modeSoFar=a[0],
	    modeCount=freq(a[0]);
				
	for (int i=0;i<a.length;i++){
	    if (freq(a[i])>modeCount){
		modeSoFar = a[i];
		modeCount = freq(a[i]);
	    }
	}
	/* just for testing purposes */
	System.out.println("Modecount: "+modeCount);
	return modeSoFar;
    }

    public int fastmode(){
	int THEMODE = 0;
	int[] ballot = new int[maxVal(a)+1];
	
	/*
	for(int i = 0 ; i < a.length ; i++){
	    ballot[i] = 0;
	}
	not needed in Java, but perhaps in other languages to reset the data
	*/
	
	for(int i = 0 ; i < a.length ; i++){
	    ballot[a[i]] = ballot[a[i]] + 1;
	}
       
	mi = maxIndex(ballot);
	THEMODE = a[maxVal(ballot)];
	System.out.println("Modecount: "+ballot[mi]);
	return THEMODE;
    }	
	    
    
    /*----------- methods --------*/

    public String toString(){
	String s = "";
	for (int i=0;i<a.length;i++){
	    s = s + a[i]+", ";
	}
	return s;
    }

	public int freq(int n){
	int count = 0;
	for (int i=0;i<a.length;i++){
	    if (a[i] == n){
		count = count + 1;
	    }
	}
	return count;
    }

    public int maxVal(int[] x){
	int max = 0;

	for(int i = 0 ; i < x.length ; i++){
	    if(x[i] > max){
		max = x[i];
	    }
	}

	return max;
    }

    public int maxIndex(int[] x){
	int maxI = 0;
	int biggest = 0;
	for(int i = 0 ; i < x.length ; i++){
	    if(x[i] > biggest){
		maxI = i;
	    }
	}
	return maxI;
    }
       
    /*----------- main --------*/

    public static void main(String[] args) {
	int arraylength=20,
	    maxvalue=20;

	if (args.length > 0) {
	    arraylength = Integer.parseInt(args[0]);
	}
	if (args.length > 1) {
	    maxvalue = Integer.parseInt(args[1]);
	}
				
	Mode m = new Mode(arraylength,maxvalue);
	// System.out.println(m);
	System.out.println("Fastmode value: "+m.fastmode());
    }

}
