package bitmagic;

public class ToggleTheKthBit {

	public static void main(String[] args) {
		int input = 10;
		int k = 3;
		int result = input ^ (1 << (k - 1));
		System.out.println("Input " + input + " B[" + Integer.toBinaryString(input) + "] Result: " + result + " B["
				+ Integer.toBinaryString(result) + "]");
		
	}
}
