#include <stdio.h>

int main () {
    int i, t, n, v, contador;

    scanf ("%d", &t);

    scanf ("%d", &n);

    i = 0;
    contador = 0;
    while (i < n) {
        scanf ("%d", &v);

        if (v * t >= 40000000) {
            contador++;
        }
        i++;
    }

    printf ("%d\n", contador);

    return 0;
}

