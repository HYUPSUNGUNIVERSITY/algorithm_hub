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

int cache[30][30];
int binocoe(int n, int k) {
    int& ret = cache[n][k];
    if (k == 0 || n == k) return 1;
    if (ret != -1) return ret;

    return ret = binocoe(n-1, k-1) + binocoe(n-1, k);
}

int main(void) {
    fast_cin();

    int n,k, ans;
    cin >> n >> k;
    n -= 1;
    k -= 1;
    memset(cache, -1, sizeof(cache));
    ans = binocoe(n,k);
    cout << ans << endl;
    return 0;
}
