
#include <iostream>
#include <algorithm>
#include <vector>
#include <list>
#include <queue>
#include <stack>

using namespace std;
#define fast_cin() ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define endl '\n'
int main(void) {
    fast_cin();
    int n, a[51] = { 0,1 }, b[51];

    cin >> n;
    a[0] = 1;
    b[0] = 0;
    for (int i = 1; i <= 50; ++i) {
        a[i] = b[i - 1];
        b[i] = a[i - 1] + b[i - 1];
    }
    cout << a[n] << " " << b[n];








    return 0;
}
