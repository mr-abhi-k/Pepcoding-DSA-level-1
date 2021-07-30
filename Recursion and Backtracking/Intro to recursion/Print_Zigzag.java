import java.io.*;
import java.util.*;

public class Print_Zigzag {

    public static void main(String[] args) throws Exception
    {
        // write your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pzz(n);
    }

    public static void pzz(int n)
    {
        if(n==0)
        return;
        
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }

}