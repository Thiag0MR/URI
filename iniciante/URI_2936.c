#include <stdio.h>

int main () {
    int qtd_gramas[] = {300, 1500, 600, 1000, 150};
    int n, i, contador;


    contador = 0;

    for (i = 0; i < 5; i++) {
        scanf ("%d", &n);
        contador = contador + (qtd_gramas[i] * n);
    }

    printf ("%d\n", contador + 225);

    return 0;
}

