#include <stdio.h>

int main () {
    int n, i, aux;

    scanf ("%d", &n);

    aux = 1;

    for (i = 0; i < n; i++) {
        printf ("%d %d %d PUM\n", aux, aux+1, aux+2);
        aux += 4;
    }
    
    return 0;
}

