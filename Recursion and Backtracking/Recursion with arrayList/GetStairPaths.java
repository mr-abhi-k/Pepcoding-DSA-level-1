import java.io.*;
import java.util.*;

public class GetStairPaths 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n)
    {
        if(n<0)
        {
            ArrayList<String> a=new ArrayList<>();
            return a;
        }

        if(n==0)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> withone=getStairPaths(n-1);
        ArrayList<String> withtwo=getStairPaths(n-2);
        ArrayList<String> withthree=getStairPaths(n-3);

        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<withone.size();i++)
        {
            ans.add("1"+withone.get(i));
        }

        for(int i=0;i<withtwo.size();i++)
        {
            ans.add("2"+withtwo.get(i));
        }

        for(int i=0;i<withthree.size();i++)
        {
            ans.add("3"+withthree.get(i));
        }

        return ans;
    }
}
