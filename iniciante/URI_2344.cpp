#include <iostream>

int main () {
    int nota;

    std::cin >> nota;

    if (nota == 0) {
        std::cout << "E" << std::endl;
    } else if (nota > 0 && nota <= 35) {
        std::cout << "D" << std::endl;
    } else if (nota > 35 && nota <= 60) {
        std::cout << "C" << std::endl;
    } else if (nota > 60 && nota <= 85) {
        std::cout << "B" << std::endl;
    } else {
        std::cout << "A" << std::endl;
    }

    return 0;
}
