/**
 * Method that returns a position in the fibonacci sequence based on
 * 'n' value given at runtime
 * @author Jordan Neumann
 */
public class fibonacci {
    /**
     *
     * @param n
     * @return n
     */
    static long recursion (long n) {
        if (n <= 1) {
            return n;
        } else {
            return recursion(n - 1) + recursion (n - 2);
        }
    }
    public static void main (String[] args) {
        System.out.println("The n'th term of the Fibonacci Sequence is " + recursion(10) + "!");
    }

}

