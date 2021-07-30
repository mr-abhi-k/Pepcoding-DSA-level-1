#include<bits/stdc++.h>
using namespace std;

vector<string> gss(string s)
{
    if(s.length()==0)
    {
        vector<string> a;
        a.push_back("");
        return a;
    }
    
    // write your code here
    char ch=s[0];
    string ros=s.substr(1);
    vector<string> recur=gss(ros);
    
    vector<string> ans;
    for(int i=0;i<recur.size();i++)
    {
        ans.push_back(recur[i]);
    }
    
    for(int i=0;i<recur.size();i++)
    {
        ans.push_back(ch+recur[i]);
    }
    
    return ans;
}

int main(){
    string s;
    cin >> s;
    vector<string> ans = gss(s);
    int cnt = 0;

    cout << '[';
    for (string str : ans){
        if (cnt != ans.size() - 1)
            cout << str << ", ";
        else
            cout << str;
        cnt++;
    }
    cout << ']';
}