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

int calc(int n) {
    int five, two, ans;
    five = n/5;
    two = (n-(five*5))%2;
//  case 1  none of five coin and also none of two coin
//  case 2  none of five coin but some two coin but exist some coin to be changed
    if (five == 0 && (n-(five*5))/2 == 0 || five == 0 && (n-(five*5))/2 != 0 && (n-(five*5))%2 != 0) return 0;
    if (two == 0) return five+((n-(five*5))/2);
    return ans = calc(n-2)+1;
}

int main(void) {
    fast_cin();

    int n;
    cin >> n;
    int ans = calc(n);
    if (ans != 0)
        cout << ans << endl;
    else
        cout << -1 << endl;
    return 0;
}
