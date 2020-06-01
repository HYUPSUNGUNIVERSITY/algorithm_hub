

#include <iostream>

int main(int argc, const char * argv[]) {
    int buger1, buger2, buger3;
    int soda1, soda2;
    
    int ibuger, isoda;
    
    std::cin >> buger1;
    std::cin >> buger2;
    std::cin >> buger3;
    std::cin >> soda1;
    std::cin >> soda2;
    
    ibuger = buger1 < buger2 ? (buger1 < buger3) ? buger1 : buger3 : (buger3 < buger2) ? buger3 : buger2;
    
    isoda = soda1 < soda2 ? soda1 : soda2;
    
    std::cout << (ibuger+isoda) - 50;
    
    return 0;
}
