import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception 
    {
        // write your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n)
    {
        if (n == 0)
        return 1;
        return n * factorial(n - 1);
    }

}