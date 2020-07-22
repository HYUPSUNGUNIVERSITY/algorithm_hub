
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
    string verdicts[4] = {"AC", "WA", "TLE", "RE"};
    int sol[4] ={};
    for (int i = 0; i < test_case; i++) {
        string ans;
        cin >> ans;
        for (int j = 0; j < 4; j++) {
            if (ans == verdicts[j]) {
                sol[j]++;
            }
        }
    }
    cout << "AC x " << sol[0] << endl;
    cout << "WA x " << sol[1] << endl;
    cout << "TLE x " << sol[2] << endl;
    cout << "RE x " << sol[3] << endl;

    return 0;
}
