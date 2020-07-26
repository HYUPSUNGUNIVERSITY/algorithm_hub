/**
 * author: BueVonHun
**/
#include <iostream>
#include <algorithm>
#include <vector>
#include <list>
#include <queue>
#include <stack>
#include <cstring>

using namespace std;
#define fast_cin() ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define endl '\n'
int main(void) {
    fast_cin();

    int test_case;
    cin >> test_case;
    int n[test_case];
    for (int i = 0; i < test_case; i++) {
        cin >> n[i];
    }

    int j = 0;
    int count = 0;
    for (int i = 0; i < test_case; i++) {
        if (j == 3)
            j=0;
        if (j==n[i]) {
            count++;
            j++;
        }
    }
    cout << count << endl;
    return 0;
}
