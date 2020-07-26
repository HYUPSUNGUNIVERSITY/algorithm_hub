/**
 * author: BueVonHun
 * More Info: https://github.com/Bue-von-hon
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

    int x;
    cin >> x;
    x-=60;
    if (x >= 40)
        cout << "A" << endl;
    else if (x >= 0)
    cout << (char)(68-x/10) << endl;
    else
        cout << "F" << endl;
    return 0;
}
