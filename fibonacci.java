public class fibonacci {
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

