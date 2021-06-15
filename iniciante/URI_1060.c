#include <stdio.h>

int main () {
    int i, qtd_positivo = 0;
    double num;

    for (i = 0; i < 6; i++) {
        scanf ("%lf", &num);
        if (num > 0) {
            qtd_positivo++;
        }
    }

    printf ("%d valores positivos\n", qtd_positivo);

    return 0;
}

