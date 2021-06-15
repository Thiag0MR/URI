#include <stdio.h>

int main () {
    float num, soma;
    int qtd_positivos = 0, i;

    for (i = 0; i < 6; i++) {
        scanf ("%f", &num);
        if (num > 0) {
            soma += num;
            qtd_positivos++;
        }
    }

    printf ("%d valores positivos\n", qtd_positivos);
    printf ("%.1f\n", soma / qtd_positivos);

    return 0;
}

