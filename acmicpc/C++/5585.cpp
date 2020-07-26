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

}

int main(void) {
    fast_cin();

    int n;
    cin >> n;
    n = 1000-n;
    int c500 = 0, c100 = 0, c50 = 0, c10 = 0, c5 = 0, c1 = 0;
    int temp = 40;
    while (temp) {
        c500 = n/500;
        temp = n%500;
        c100 = temp/100;
        temp = temp%100;
        c50 = temp/50;
        temp = temp%50;
        c10 = temp/10;
        temp = temp%10;
        c5 = temp/5;
        temp = temp%5;
        c1 = temp/1;
        break;
    }
    cout << c500 + c100 + c50 + c10 + c5 + c1 << endl;
    return 0;
}
