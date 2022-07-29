package assignment2;

public class Palindrome {
	
	public static void main(String[] args) {
		String value = "madam";
		String rev   ="";
		char[] cha  =value.toCharArray();
		
		   
		for(int i =cha.length -1;i>=0;i--) {
		    	rev = rev + value.charAt(i);
		   
		    }
		    System.out.println(rev);
		    if(value.equals(rev)) {
		    	System.out.println("It is a Palindrome");
		    }
		    else {
		    	System.out.println("Not a Palindrome");
		    }
	}

}
