package bitmagic;

public class CountSetBit {
	public static void main(String[] args) {
		//Brute-Force Solution
		int number = 12;
		int count = 0;
		while (number != 0) {
			number = number & (number-1);
			count++;
		}
		System.out.println(count);
		
		//Kernighan’s algorithm
		number = 12;
		count = 0;
        while (number != 0)
        {
            count += (number & 1);
            number >>= 1;
        }
        System.out.println(count);
	}
}
