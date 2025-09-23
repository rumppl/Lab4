public class Task03A {
    public static void main(String[] args) {

        System.out.println(fib(6));

    }

    static int fib(int n) /* the time complexity here is O(2^n) because if the function does not pass the base case tests,
                            then fib() with run twice, for n-1 and n-2. */
    {

        if (n <= 0) // base case

            return 0;

        else if (n == 1) // base case

            return 1;

        else

            return fib(n-1) + fib(n-2);

    }
}