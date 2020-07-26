/**
 * author: BueVonHun
 * More Info: https://github.com/Bue-von-hon
**/
#include <iostream>
#include <cstring>

using namespace std;
#define fast_cin() ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define endl '\n'
int table[60];
int calc(int n) {
    int& ret = table[n];
    if (table[n] != -1) return ret;

    return ret = (calc(n-1) + calc(n-2))%10;
}

int main(void) {
    fast_cin();
    memset(table, -1, sizeof(table));
    table[0] = 1;
    table[1] = 1;
    table[2] = 2;
    int n;
    cin >> n;

    int ans = calc(n);
    cout << ans << endl;
    return 0;
}
