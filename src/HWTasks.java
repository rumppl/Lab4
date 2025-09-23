public class HWTasks {
    public static void main(String[] args) {

        //RescursiveWorld(6);

        SumOfMult7s(1,49,0);

    }
    static void RescursiveWorld(int n) { // a function that prints "Hello World" n times recursively.
        if (n > 0) {
            System.out.println("Hello, World!");
            RescursiveWorld(n - 1);
        }
    }

    static void SumOfMult7s(int min, int max, int sum){ // a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
        int multiple = min;                           // FIXME how do i keep a sum between calls without a param??????

        if(multiple <= max){
            if(multiple % 7 == 0){
                sum += multiple;
                System.out.println(sum);
            }
            SumOfMult7s(min+1, max, sum);
        }
    }

}