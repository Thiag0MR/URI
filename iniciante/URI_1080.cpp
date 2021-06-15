#include <iostream>

int main () {
    int num, maior, posicao, i = 1;

    for (i = 1; i <= 100; i++) {
        std::cin >> num;
        if (i == 1 || (maior < num)) {
            maior = num;
            posicao = i;
        }
    }
    std::cout << maior << std::endl;
    std::cout << posicao << std::endl;
    
    return 0;
}

