package com.tutai.ds;

public class SNode {

	int value;
    SNode next;
	
    public SNode(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		String nextVal = next == null ? null : ""+next.value;
		return " SNode[" + value + ", Next= "+nextVal+"]";
	}
    
    
	
}
