package testone;

public class Handle_exce { 
	 
	 public static void main(String[] args) {
	  catchexc();
	 }
	 private static void catchexc() {
	     try {
	      //throwexc() Method called.
	      throwexc();
	     } catch (ArrayIndexOutOfBoundsException e) { 
	         System.out.println("Array Index out of bound exception.");
	     }
	 } 
	 
	 private static void throwexc() {
	    //This statement will throw ArrayIndexOutOfBoundsException exception.
	    throw new ArrayIndexOutOfBoundsException();   
	 } 
	

	public class Handleexce { 
	 
	 public void main(String[] args) {
	  try{
	   int i=5/0; //Exception will be thrown.
	   System.out.println("Value Of i Is "+i);//This statement will be not executed.
	  }catch (Exception e)//Exception will be caught. 
	  {
	   System.out.println("Inside catch."+e);//print the exception.
	  }finally//finally block will be executed.
	  {
	   System.out.println("Inside finally. Please take appropriate action");
	  }
	  
	  try{
	   int j=5/2; //Exception will be not thrown.
	   System.out.println("Value Of j Is "+j);//This statement will be executed.
	  }catch (Exception e)//No exception so catch block code will not execute.
	  {
	   System.out.println("Inside catch."+e);
	  }finally//finally block code will be executed.
	  {
	   System.out.println("Inside finally. Please take appropriate action");
	  }
	 } }}
	