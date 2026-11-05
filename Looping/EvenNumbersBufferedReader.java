package Looping;

public class EvenNumbersBufferedReader {

	public static void main(String[] args) {
		System.out.println("Even numbers from 2 to 100 (new line after multiples of 20):");
        
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + "\t");
            
            if (i % 20 == 0) {
                System.out.println();
            }
        }

	}

}
