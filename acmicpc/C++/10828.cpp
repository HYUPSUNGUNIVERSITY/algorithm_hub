
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
    stack<int> st;
    for (int i = 0; i < test_case; i++) {
        string s;
        cin >> s;
        if (s == "push") {
            int a;
            cin >> a;
            st.push(a);
        } else if (s == "pop") {
            int a;
            if (!st.empty()) {
                a = st.top();
                cout << a << endl;
                st.pop();
            } else {
                cout << "-1" << endl;
            }
        } else if (s == "empty") {
            if (st.empty()) {
                cout << "1" << endl;
            } else {
                cout << "0" << endl;
            }
        } else if (s == "size") {
            int a;
            a = st.size();
            cout << a << endl;
        } else if (s == "top") {
            int a;
            if (!st.empty()) {
                a = st.top();
                cout << a << endl;
            } else {
                cout << "-1" << endl;
            }

        }
    }




    return 0;
}
