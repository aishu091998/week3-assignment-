package assignment2;

public class bankinfo {
	void saving () {
   	  System.out.println("I have an saving account");
    }
    void fixed() {
   	  System.out.println("I have an fixed account");
   
    }
    void deposit() {
   	 System.out.println("430000");
    }
}

class AxisBank1  extends bankinfo{
    void deposit() {
 	   System.out.println("I am depositing 430000 in axis bank");
    }

}

class overriding {
	   
    public static void main(String[]args) {
     AxisBank1 obj = new AxisBank1();
   	 obj.deposit();
		
	}
}
