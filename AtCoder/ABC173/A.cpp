
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

    int n;
    cin >> n;

    int yen = 1000;

    while (n>0) {
        n -= yen;
    }
    cout << -n << endl;
    return 0;
}
