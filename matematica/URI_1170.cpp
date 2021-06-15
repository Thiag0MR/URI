#include <iostream>

int main () {

    int n;

    std::cin >> n;

    for (int i = 0; i < n; i++) {
        float c;

        std::cin >> c;

        int contador = 0;
        while (c > 1) {
            c /= 2;
            contador++;
        }

        std::cout << contador << " dias" << std::endl;
    }

    return 0;
}

