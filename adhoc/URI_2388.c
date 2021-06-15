#include <stdio.h>

int main () {
    int n, t, v, i, contador;

    scanf ("%d", &n);


    contador = 0;


    for (i = 0; i < n; i++) {
        scanf ("%d %d", &t, &v);

        contador += (t * v);

    }

    printf ("%d\n", contador);

    return 0;
}

