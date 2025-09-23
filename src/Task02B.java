public class Task02B {
    public static void main(String[] args) {
        System.out.println("The GCD is: " + gcd(135,10)); // the output
    }

    static int gcd(int x, int y) {

        if (simple_mod(x,y) == 0) // replace modulo with the simple mod method

            return y;

        else

            return gcd(y, simple_mod(x,y));

    }

    static int simple_mod(int x, int y){ // modulo via subtraction
        while(x >= y){
            x -= y;
        }
        return x;
    }
}