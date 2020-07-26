
# include <iostream>
# include <algorithm>
#include <vector>
#include <list>
#include <queue>
#include <stack>

using namespace std;
#define fast_cin() ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);
#define endl '\n'
int divByA(int n, int a) {
    return n%a;
}
int divByB(int n, int b) {
    return n%b;
}
int divByC(int n, int c) {
    return n%c;
}

int main(void) {

    fast_cin();

    int a, b, c, n;
    cin >> a >> b >> c >> n;
    int ans = 0;
    for(int i=0; i<=50; i++)
        for(int j=0; j<=50; j++)
            for(int k=0; k<=50; k++)
                if((a*i) + (b*j) + (c*k) == n)
                    ans=1;
                cout << ans;
                return 0;
}

