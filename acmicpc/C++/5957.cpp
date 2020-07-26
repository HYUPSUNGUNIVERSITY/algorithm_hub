
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
    int dishes = test_case;
    stack<int> unwash;
    stack<int> undriy;
    stack<int> done;
    for (int i = dishes; i > 0; i--) {
        unwash.push(i);
    }
    for (int i = 0; i < test_case-1; i++) {
        int c, d;
        cin >> c >> d;
        if (c == 1) {
            for (int j = 0; j < d; j++) {
                if (!unwash.empty()) {
                    int temp = unwash.top();
                    unwash.pop();
                    undriy.push(temp);

                }
            }
        } else if (c == 2) {
            for (int j = 0; j < d; j++) {
                if (!undriy.empty()) {
                    int temp = undriy.top();
                    undriy.pop();
                    done.push(temp);

                }
            }
        }
    }

    for (int i = 0; i < dishes; i++) {
        if (!done.empty()) {

        int temp;
        temp = done.top();
        cout << temp << endl;
        done.pop();
        }
    }

    return 0;
}
