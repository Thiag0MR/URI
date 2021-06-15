#include <iostream>
#include <algorithm>
#include <cmath>

void converteBinario (int *v, unsigned int n) {
    short int i = 0;

    while ((n / 2)!= 0 ||  (n % 2) != 0) {
        v[i] = n % 2;
        n = n / 2;
        i++;
    }
}

unsigned int converteDecimal (int *v) {
    unsigned int soma = 0;
    short int i;

    for (i = 0; i < 32; i++) {
        if (v[i] != 0) {
            soma += (v[i] * pow (2, 31 - i));
        }
    }
    return soma;
}

int main () {
    int v1[32], v2[32], v3[32];
    unsigned int n1, n2;
    short int i;

    while (std::cin >> n1 >> n2) {

        for (i = 0; i < 32; i++) {
            v1[i] = 0;
            v2[i] = 0;
        }

        converteBinario (v1, n1);
        converteBinario (v2, n2);

        std::reverse (v1, v1+32);
        std::reverse (v2, v2+32);

        for (i = 0; i < 32; i++) {
            if (v1[i] + v2[i] == 2) {
                v3[i] = 0;
            } else {
                v3[i] = v1[i] + v2[i];
            }
        }

        std::cout << converteDecimal (v3) << std::endl;

    }

    return 0;
}

