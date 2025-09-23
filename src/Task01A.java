public class Task01A {
    public static void main(String[] args) {
        countDown(17);
    }
    // The output of the code will be “…\n” for each number that is not equal to 0. When it is 0, the output is “Blastoff!”
    // The time complexity of this code is O(n) because the amount of iterations that will be completed is equal to N

    static void countDown(int num)
    {

        if (num == 0) // test

            System.out.println("Blastoff!");

        else {

            System.out.println("...");

            countDown(num-1); // recursive call

        }
    }
}