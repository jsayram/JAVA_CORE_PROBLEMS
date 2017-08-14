package JavaCoreHW.Q11AccessFromPackage;

import JavaCoreHW.Q11AccessFromPackage.AnotherPackage.*;

public class AccessFrom {

    public AccessFrom() { }

    public static void main(String[] args) {
        Variables numbers = new Variables();

        System.out.println("Float one: "+ numbers.floatOne);
        System.out.println("Float Two: "+ numbers.floatTwo);
    }
}
