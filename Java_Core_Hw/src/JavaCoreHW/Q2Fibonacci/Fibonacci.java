//package JavaCoreHW.Q2Fibonacci;

public class Fibonacci {

    public Fibonacci(){ }

    public static void main(String[] args) {

        System.out.println("Fibonacci numbers up to 25 starting from zero: ");
        int upTo = 25;
        int[] numbers = new int[upTo];
        Fibanocci(upTo , numbers);
        printArray(numbers);

    }
    static void Fibanocci(int upTo, int numbers[]){
        //create first two numbers starting form zero
        for(int i=0 ; i < 2; i++){
            numbers[i] = i;
        }
        //create the Fibonacci numbers and store it in an array
        //starts at 2 because we already have the first two numbers of the sequence from above
        for(int i=2; i < upTo; i++){
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
    }

    //print the array sequence
    static void printArray(int myArray[])
    {
        //get array length
        int n = myArray.length;
        //iterate through array and print it out
        for (int i=0; i<n; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

}
