package com.tutai.oops.staticp;

public class CallingOneConstructorfromAnother {
	private static class Foo {
	    private int x;

	    public Foo() {
	        this(1);
	        System.out.println("I am good");
	    }

	    public Foo(int x) {
	        this.x = x;
	        System.out.println("I am verry good");
	    }
	}
	
	
	public static void main(String[] args) {
		new Foo();
	}
	
	

}
