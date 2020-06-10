#include <iostream>

int main(void) {
    int num;
    std :: cin >> num;
    int j = 0;
    int starnum = 2 * num - 1;
    int count = 0;
    for (int i = 0; i < 2 * num - 1; i++) {
        if (i < num) {
            if (count > 0)
                for (int k = 0; k < count; k++)
                    std :: cout << " ";
            for (j = starnum; j > 0; j--) {
                std :: cout << "*";
            }
            std :: cout << "\n";
            if (starnum > 2)
                starnum -= 2;
            count++;
        }
        else {
            if (count > 0)
                for (int k = 0; k < count-2; k++)
                    std :: cout << " ";
            count--;
            starnum += 2;
            for (j = 0; j < starnum; j++) {
                std :: cout << "*";
            }
            std :: cout << "\n";
        }
    }

    return 0;
}