public class HWTasks {
    public static void main(String[] args) {

        //RescursiveWorld(6);

        System.out.println(SumOfMult7s(1,49));

    }
    static void RescursiveWorld(int n) { // a function that prints "Hello World" n times recursively.
        if (n > 0) {
            System.out.println("Hello, World!");
            RescursiveWorld(n - 1);
        }
    }

    static int SumOfMult7s(int min, int max){ // a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
        int x = min;

        if(x <= max){
            if(x % 7 == 0){
                System.out.println(x);
            }
            return SumOfMult7s(min+1, max);
        }
        return 0;
    }


    static int testSum(int[] myArr, int n){
        if(n <= myArr.length){

        }
        return 0;
    }
}