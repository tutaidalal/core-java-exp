package bitmagic;

public class FindLastPowerOfTwo {
	public static void main(String[] args) {
		int n = 127;
		// initialize result by 2
		int k = 1;

		// double `k` and divide `n` in half till it becomes 0
		while ((n >>= 1) != 0) {
			k = k << 1; // double `k`
		}

		System.out.println("k=" + k);

	}
}
