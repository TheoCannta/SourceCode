package recursion;

public class Warmup {
    /**
     * Calculate the nth fibonancci number using recursion
     * 
     * @param n the nth fibonancci number to calculate
     * @return
     */
    public static long fibonancci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonancci(n - 1) + fibonancci(n - 2);
    }

    /**
     * Use recursion to find the largest element in an array of integers
     * 
     * @param numbers
     * @param index
     * @return
     */
    public static int largest(int[] numbers, int index) {
        // FIXME
        if (true) {
            return numbers[0];
        }

        return Math.max(numbers[index], largest(numbers, index - 1));
    }

    public static void main(String[] args) {
        long x = fibonancci(3);
        System.out.println(x);

        int[] someNumbers = new int[] { 5, 9, 6, 25, 7, 3, 3 };
        int largestNumbner = largest(someNumbers, someNumbers.length - 1);

        System.out.println(largestNumbner);
    }
}
