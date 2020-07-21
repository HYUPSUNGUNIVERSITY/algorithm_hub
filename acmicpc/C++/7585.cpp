
# include <iostream>
# include <algorithm>
#include <vector>
#include <list>
#include <queue>
#include <stack>

using namespace std;
#define fast_cin() ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define endl '\n'
int main(void) {
    fast_cin();

    string str;
    string s;
    while (s != "#") {
        getline(cin, str);
        int size = str.length();
        stack<string> st;
        for (int i = 0; i < size; i++) {

            s = str[i];
            if (s == "(") {
                st.push(s);
            } else if (s == "[") {
                st.push(s);
            } else if (s == "{") {
                st.push(s);
            }
            if (s == ")") {
                if (st.top() == "(")
                    st.pop();
                else
                    st.push(s);
            } else if (s == "]") {
                if (st.top() == "[")
                    st.pop();
                else
                    st.push(s);
            } else if (s == "}") {
                if (st.top() == "{")
                    st.pop();
                else
                    st.push(s);
            }

    }
        if (s != "#")
            if (st.empty()) {
                cout << "Legal" << endl;
            } else if (!st.empty()) {
                cout << "Illegal" << endl;
            }


    }

    return 0;
}
