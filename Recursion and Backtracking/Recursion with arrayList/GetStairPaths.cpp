#include<bits/stdc++.h>
using namespace std;


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
