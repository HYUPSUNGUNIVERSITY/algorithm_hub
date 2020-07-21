
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
    string q = "?";
    int test_case;
    string ans;
    cin >> test_case;
    for (int i = 0; i < test_case; i++) {
        string s;
        vector<string> v;
        cin >> s;
        v.push_back(s);
        int size = s.length();

        if (!ans.empty()) {
            for (int  j = 0; j < size; j++) {
                if (ans.at(j) != s.at(j))
                    ans[j] = q[0];
            }
        } else {
            ans = v.back();
        }
    }
    cout << ans << endl;



    return 0;
}
