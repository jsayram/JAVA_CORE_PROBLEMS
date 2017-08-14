//package JavaCoreHW.Q4Nfactorial;

public class NFactorial {

    public NFactorial() {
    }

    public static void main(String[] args) {

        //Here you specify N
        long N = 10;

        //this will be the final factorial answer
        //initialized as 1 for simplicity
        long factorial = 1;

        //if N is equal to 0 then
        if (N == 0) {
            factorial = 1;
        }
        for (int i = 1; i <= N; i++) {
            factorial *= i;
            //System.out.println(i + "\n");
        }
        System.out.println(N + "! = " + factorial);
    }
}


