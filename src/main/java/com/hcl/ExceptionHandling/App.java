package com.hcl.ExceptionHandling;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	aExUnHandled();
		//aExHandled();
    	//aExThrow();
    	
		System.out.println("End");
	    
	    	System.out.println("Updated file in Git Hub for pull request");
    
      
    }
    
    public static void aExThrow() throws Exception {
		
  		//int result = 0;
  		//result = 5/0;
  		
  		int result = 2;
  		result = 10/2;
  		//throw new Exception("Throw Exception : ");
  		System.out.println(" Result is : " + result);
  	

  	}
    
    public static void aExUnHandled() {
		
		//int result = 0;
		//result = 5/0;
		
		int result = 2;
		result = 10/2;
		System.out.println(" Result is : " + result);
	

	}

	public static void aExHandled() {
		try {
		int result = 0;
		result = 5/0;
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("In the Finally block");
		}
	}
	
}

