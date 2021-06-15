#include <iostream>
#include <cmath>

int main () {
    int T, N;

    std::cin >> T;

    for (int i = 0; i < T; i++) {
        std::cin >> N;
        unsigned int soma = 0;
        for (int j = 0; j < N; j++) {
            soma += static_cast <int> (pow (static_cast <double> (2), static_cast <double> (j)));
        }
        std::cout << soma << std::endl;
    }

    return 0;
}
