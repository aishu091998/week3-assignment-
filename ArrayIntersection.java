package assignment2;

public class ArrayIntersection {
	
	public static void main(String[] args) {
		 int arr1[] = {9,6,3,2,1,4};  //array1
		 int arr2[] = {8,7,5,10,12};  //array2
		 int i =0;
		 int j =0;	
		  while(i<arr1.length && j<arr2.length) {
			  if(arr1[i]==arr2[j]) {
				  System.out.println("Numbers of intersection between two arrays is " +arr1[i]);
				            i++;
				            j++;
			  }
			  else if(arr1[i]>arr2[j]) {
				  j++;
			  }else {
		          i++;
			  }    
		  }
	}
}	


