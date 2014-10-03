public class Practice {

    private int temp;
    private int dayOfWeek;

    public Practice(String s){
    }
    public Practice() {
    }

    //Methods
    public void setTemp(int i){
	temp = i;
    }

    public void getTemp(){
	System.out.println("The high today is: " + temp);
    }

    public void setDayOfWeek(int i){
	dayOfWeek = i;
    }

    public void getDayOfWeek(){
	System.out.println("The day of the week is: " + dayOfWeek);
    }

}



