#include <stdio.h>

int main () {
    int num;
    int qtd_pares = 0, i;

    for (i = 0; i < 5; i++) {
        scanf ("%d", &num);
        if (num % 2 == 0) {
            qtd_pares++;
        }
    }

    printf ("%d valores pares\n", qtd_pares);

    return 0;
}

