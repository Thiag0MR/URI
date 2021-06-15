#include <iostream>
#include <cstdlib>

struct cordenada {
    int x, y;
};

int main () {
    struct cordenada inicio, fim;

    while (true) {
        std::cin >> inicio.x >> inicio.y >> fim.x >> fim.y;

        if (inicio.x == 0 && inicio.y == 0 && fim.x == 0 && fim.y == 0) {
            break;
        }

        if (inicio.x == fim.x && inicio.y == fim.y) { // Igual
            std::cout << "0" << std::endl;
        } else if ((inicio.x == fim.x && inicio.y != fim.y) || (inicio.x != fim.x && inicio.y == fim.y)) { // Vertical ou horizontal
            std::cout << "1" << std::endl;
        } else {
            int dif1 = abs (inicio.x - fim.x);
            int dif2 = abs (inicio.y - fim.y);

            if (dif1 == dif2) {
                std::cout << "1" << std::endl;
            } else {
                std::cout << "2" << std::endl;
            }

        }

    }


    return 0;
}

