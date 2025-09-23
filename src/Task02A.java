public class Task02A {
    public static void main(String[] args) {
        System.out.println("The GCD is: " + gcd(10,120)); // the output
    }

    static int gcd(int x, int y) {

        if (x % y == 0) //base case

            return y;

        else

            return gcd(y, x % y);

    }
}