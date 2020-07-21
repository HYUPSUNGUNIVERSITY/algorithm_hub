
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
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int asize = sizeof(a)/sizeof(a[0]);
    sort(a,a+n);

    int m;
    cin >> m;
    int x[m];
    for (int i = 0; i < m; i++) {
        cin >> x[i];
    }


    for (int i = 0; i < m; i++){
        if (binary_search(a, a+asize, x[i])) {
            cout << "1" << endl;
        } else {
            cout << "0" << endl;
        }
    }




    return 0;
}
