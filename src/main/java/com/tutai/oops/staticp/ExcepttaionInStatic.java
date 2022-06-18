package com.tutai.oops.staticp;

public class ExcepttaionInStatic {

	static int i, j;
	   static {
	      System.out.println("In the static block");
	      try {
	         i = 0;
	         j = 10/i;
	      } catch(Exception e){
	         System.out.println("Exception while initializing" + e.getMessage());
//	         throw new RuntimeException(e.getMessage());
	      }
	   }
	   public static void main(String args[]) {
		  System.out.println("In the main() method");
		  ExcepttaionInStatic sbe = new ExcepttaionInStatic();
	      System.out.println("Value of i is : "+i);
	      System.out.println("Value of j is : "+ j);
	      ExcepttaionInStatic2 x = new ExcepttaionInStatic2();
	      System.out.println("Value of i is : "+x.i);
	      System.out.println("Value of j is : "+ x.j);
	   }
}
