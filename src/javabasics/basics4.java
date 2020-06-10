package javabasics;

public class basics4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 6;  
	     //  Character c;  
	       System.out.println();  
	     //  size = 2;  
	       int i, j, k; int l = 0; 
	       for (i = 0; i < size ; i++) 
	       	   { 
	    	   for (j = size; j > i; j--)
	    	  {  
	             System.out.print(" ");  
	             
	          }  
	    	//   System.out.print(i);

	    	  for (k = 1; k <= (2 * i -1); k++)
	           {  
	               
	            	 System.out.print("*");
	                        
	           } 
	    
	     	           System.out.println();  
	          }
	       for (j = 0; j < i; j++)
	    	  {  
	             System.out.print(" ");  
	             
	          }  
	    	//   System.out.print(i);

	    	  for (k = 1; k <= (2 * i -1); k++)
	           {  
	               
	            	 System.out.print("*");
	                        
	           } 

	}

}
