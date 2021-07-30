import java.io.*;
import java.util.*;

public class GetSubsequence
{
    public static void main(String[] args) throws Exception 
    {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) 
    {
        //base case
        if(str.length()==0)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }

        //take first character
        char ch=str.charAt(0);
        //take rest of the characters
        String ros=str.substring(1);
        //find for smaller inputs :faith
        ArrayList<String> recur=gss(ros);


        ArrayList<String> ans=new ArrayList<>();
        //first time ch not taken
        for(int i=0;i<recur.size();i++)
        {
            ans.add(recur.get(i));
        }
        //second time ch taken
        for(int i=0;i<recur.size();i++)
        {
            ans.add(ch+recur.get(i));
        }

        return ans;
    }
}