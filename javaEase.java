import jEase.*;
import java.io.*;

public class javaEase {
    public static void main(String[] args) {
        IsIn f  = new IsIn();
        Check c = new Check();

        String[] s = { "Hello", "Blue", "Test" };
        int[]    i = { 2, 6, 23, 99, 104 };

        System.out.println("---- IsIn.TheArray Test -----");
        System.out.println(f.theArray(2, i));
        System.out.println(f.theArray("Green", s));
        System.out.println("---- Check.isDate  Test -----");
        System.out.println(c.isDate(30, 2, 2002));
        System.out.println(c.isDate(29, 2, 2002));
        System.out.println(c.isDate(28, 2, 2002));
        System.out.println("---- Check.isEven  Test -----");
        System.out.println(c.isEven(30));
        System.out.println(c.isEven(29));
        System.out.println("---- !Check.isEven Test -----");
        System.out.println(!c.isEven(30));
        System.out.println(!c.isEven(29));

    }
}