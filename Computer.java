package org.system;

public class Computer {
	      void ComputerModel() {
	    	  System.out.println("Mac pro");
	      }

}
class desktop extends Computer{
	     void desktopsize() {
	    	 System.out.println("pro 64");
	     }
}
class Mytes{
	    public static void main(String[] args) {
	    	desktop c=new desktop();
	    	c.ComputerModel();
	    	c.desktopsize();
	    }
}