
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

    int test_case;
    cin >> test_case;
    for (int i = 0; i < test_case; i++) {
        string s;
        stack<string> st;
        cin >> s;
        int size = s.length();
        for (int j = 0; j < size; j++) {
            string temp;
            temp = s[j];

            if (!st.empty()) {
                if (temp == "(") {
                    st.push(temp);
                }
                if (temp == ")") {
                    if (st.top() == "(")
                        st.pop();
                    else
                        st.push(temp);
                }
            } else {
                st.push(temp);
            }
        }
        if (st.empty())
            cout << "YES" << endl;
        else
            cout << "NO" << endl;

    }




    return 0;
}
