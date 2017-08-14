//package JavaCoreHW.Q1BubbleSort;

public class BubbleSort {

    public BubbleSort() { }

    public static void main(String[] args) {

        int[] myArray = {4, 6, 5, 7, 3, 2, 9, 1};

        System.out.println("Not Sorted:");
        printArray(myArray);

        BubbleSort(myArray);

        System.out.println("Sorted:");
        printArray(myArray);
    }

   static void BubbleSort(int myArray[]){

        //length of array
        int arrayLength = myArray.length;

        //number of iterations through the array is determined by its length-1
        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                //swap the two values if the first is greater than the next
                if (myArray[j] > myArray[j + 1]) {

                    //set the first to temp variable
                    int temp = myArray[j];
                    //set the second to the first position
                    myArray[j] = myArray[j + 1];
                    //set the temporary variable to the next position
                    myArray[j + 1] = temp;
                }
            }
        }
    }

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