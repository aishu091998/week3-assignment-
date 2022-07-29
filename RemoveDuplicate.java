package assignment2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

        private static int i;

		public static void main(String[] args) {
			 
        	  String text= "We Learn Java Basics As part of java seesion in java week1";
        	  String[] textarr = text.split(" ");
          
        	Set<String>s = new LinkedHashSet <String>();
        	
     for(int i=0;i<textarr.length;i++);{
    	    
			s.add(textarr[i]);
                   } 
     for(String word :s) {
    	    System.out.println(word+" ");
  }
     
          }
        
  }
		  
			
		
			
		

