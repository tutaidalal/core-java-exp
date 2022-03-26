package com.tutai.exp.lambda;

@FunctionalInterface
public interface SimpleFunctionalInterface {

  int operation();
  
  default int operation1() { 
	  System.out.println("Hello World");
	return 0;
  }
}
