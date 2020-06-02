//
//  BOJ2523.cpp
//  back
//
//  Created by kimtaehun on 2020/06/02.
//  Copyright © 2020 kimtaehun. All rights reserved.
//

#include <stdio.h>
#include <iostream>
int main() {
    int num;
    std::cin >> num;
    
    for (int i = 1; i <= num;i++) {
            for (int j = 1; j <= i; j++)
                std::cout << "*";
            std::cout << "\n";
    }
    for (int i = num+1; i < 2*num; i++) {
        for (int j = 2*num-1; j >= i; j--) {
                   std::cout << "*";
               }
               std::cout << "\n";
    }
    return 0;
}
