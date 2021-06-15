#include <stdio.h>

int main () {
    int t1[3], t2[3], contador, i;

    scanf ("%d %d %d", &t1[0], &t1[1], &t1[2]);

    scanf ("%d %d %d", &t2[0], &t2[1], &t2[2]);


    contador = 0;

    for (i = 0; i < 3; i++) {
        if (t1[i] - t2[i] < 0) {
            contador += t2[i] - t1[i];
        }
    }

    printf ("%d\n", contador);

    return 0;
}

