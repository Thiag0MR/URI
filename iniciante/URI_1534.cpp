#include <iostream>

int main () {
    int N, i, j, aux;

    while (true) {
        std::cin >> N;
        if (!std::cin) {
            break;
        }
        int matriz [N][N];
        aux = N-1;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else if (j == aux) {
                    matriz[i][aux] = 2;
                }else {
                    matriz[i][j] = 3;
                }
            }
            aux--;
        }
        if (N % 2 != 0) {
            matriz[N/2][N/2] = 2;
        }

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                std::cout << matriz[i][j];
            }
            std::cout << std::endl;
        }
    }
    return 0;
}

