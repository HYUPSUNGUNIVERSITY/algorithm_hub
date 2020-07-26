
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

    int test_case;
    cin >> test_case;
    long long int tile[81];
    tile[0] = 1;
    tile[1] = 1;
    for (int i = 2; i < test_case; i++) {
        tile[i] = tile[i-2] + tile[i-1];
    }
    if (test_case != 1)
        cout << ((tile[test_case-1]+tile[test_case-2])+tile[test_case-1])*2 << endl;
    else
        cout << "4" << endl;
    return 0;
}
