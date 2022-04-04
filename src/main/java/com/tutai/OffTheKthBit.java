package bitmagic;

public class OffTheKthBit {

	public static void main(String[] args) {
		int input = 10;
		int k = 2;
		int result = input & ~(1 << (k - 1));
		System.out.println("Input " + input + " B[" + Integer.toBinaryString(input) + "] Result: " + result + " B["
				+ Integer.toBinaryString(result) + "]");
		
	}
}
