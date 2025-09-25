public class HWTasks {
    public static void main(String[] args) {

        //RescursiveWorld(6);

        System.out.println(SumOfMult7s(0,300));

        //int[] myArr = {1,7,9,25,31,55};

        //System.out.println("keyValue is located at index: " + RecursiveBinarySearch(myArr, 9));

    }
    static void RescursiveWorld(int n) { // a function that prints "Hello World" n times recursively.
        if (n > 0) {
            System.out.println("Hello, World!");
            RescursiveWorld(n - 1);
        }
    }

    static int SumOfMult7s(int min, int max){ // a function that returns the sum of all numbers between min and max that are multiples of 7 using recursion.
        int sum = 0;

        return SumOfMult7sRecursion(min, max, sum);
    }

    static int SumOfMult7sRecursion(int min, int max, int sum){
        if(min >= max){
            return -1;
        }

        int multiple = min;

        if(multiple % 7 == 0){
            sum += multiple;
        }


        return SumOfMult7sRecursion(min+1, max, sum);
    }


    static int  RecursiveBinarySearch(int[] arr, int keyValue){ // break it up into 2 methods
        int bottom = 0;
        int top = arr.length;
        return BinarySearchRecursion(arr, keyValue, bottom, top);
    }

    static int BinarySearchRecursion(int[] arr, int keyValue, int bottom, int top){
        if(top < bottom){
            return -1;
        }

        int middle = (top + bottom) / 2; // locate the middle of the array

        if(arr[middle] < keyValue){ // shift to bottom half
            bottom = middle + 1;
        }
        else if(arr[middle] > keyValue) { // shift to top half
            top = middle - 1;
        }
        else{
            return middle; // keyValue has been located at this index #
        }

        return BinarySearchRecursion(arr, keyValue, bottom, top);
    }

}