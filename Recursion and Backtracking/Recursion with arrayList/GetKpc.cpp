#include<bits/stdc++.h>
using namespace std;

vector<string> getKpc(string str)
{
    if(str.length()==0)
    {
        vector<string> a;
        a.push_back("");
        return a;
    }
    
    string codes[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    char ch=str[0];
    string ros=str.substr(1);
    vector<string> recur=getKpc(ros);
    
    vector<string> ans;
    string code=codes[ch-'0'];
    for(int i=0;i<code.length();i++)
    {
        for(int j=0;j<recur.size();j++)
        {
            ans.push_back(code[i]+recur[j]);
        }
    }
    
    return ans;
}

int main()
{
    string s;
    cin >> s;
    vector<string> ans = getKpc(s);
    int cnt = 0;
    
    cout << '[';
    for (string str : ans)
    {
        if (cnt != ans.size() - 1)
            cout << str << ", ";
        else
            cout << str;
        cnt++;
    }
    cout << ']';
}