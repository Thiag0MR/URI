#include <iostream>

int main () {
    std::string str;

    std::cin >> str;

    int soma = 0;
    for (int i = 0; i < str.size(); i++) {
        soma += str[i] - 48;
    }

    int temp = soma % 3;
    if (temp == 0) {
        std::cout << temp << std::endl;
    } else if (temp == 1) {
        std::cout << temp << std::endl;
    } else {
        std::cout << temp << std::endl;
    }


    return 0;
}

