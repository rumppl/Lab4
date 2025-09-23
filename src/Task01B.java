public class Task01B {
    public static void main(String[] args) {
        countDown(17);
    }

    static void countDown(int num)
    {

        if (num%2 == 0 && num > 0) { // check odd or even and is greater than 0

            System.out.println(num);
            countDown(num - 1);

        } else if (num == 0) { // if odd or 0 check is not 0

            System.out.println("Blastoff!");

        } else {

            System.out.println("..."); // the number is odd
            countDown(num-1); // recursive call

        }
    }
}