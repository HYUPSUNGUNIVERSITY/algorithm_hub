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

long bridge[31][31];

long binomibal_coefficient(int n, int r) {

    if ( r == 0 || n == r) return 1;

    long& ret = bridge[n][r];

    if (ret != -1)
        return bridge[n][r];

    return ret = binomibal_coefficient(n-1, r-1) + binomibal_coefficient(n-1, r);
}

int main(void) {
    fast_cin();
    long ans;
    int test_case;
    cin >> test_case;

    for (int i = 0; i < test_case; i++) {
        int n,r;
        cin >> r >> n;
        memset(bridge, -1, sizeof(bridge));

        ans = binomibal_coefficient(n, r);
        cout << ans << endl;
    }

    return 0;
}
