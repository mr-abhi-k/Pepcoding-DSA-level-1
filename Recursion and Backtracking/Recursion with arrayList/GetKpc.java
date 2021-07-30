import java.io.*;
import java.util.*;

public class GetKpc
{
    static String codes[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception
    {
            Scanner sc = new Scanner(System.in);
            String  s= sc.next();
            ArrayList<String> ans = getKPC(s);
            System.out.println(ans);
            
    } 
    public static ArrayList<String> getKPC(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> recur=getKPC(ros); //faith

        ArrayList<String> ans=new ArrayList<>();

        String code=codes[ch-'0'];
        for(int i=0;i<code.length();i++)
        {
            for(int j=0;j<recur.size();j++)
            {
                ans.add(code.charAt(i)+recur.get(j));
            }
        }
        return ans;
    }

}
