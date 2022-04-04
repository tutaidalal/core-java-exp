package bitmagic;

public class NnsetTheRightmostSetBit {

	public static void main(String[] args) {
		int input = 10;
		int result = input & (input - 1);
		
		System.out.println("Input " + input + " B[" + Integer.toBinaryString(input) + "] Result: " + result + " B["
				+ Integer.toBinaryString(result) + "]");
	}

}
