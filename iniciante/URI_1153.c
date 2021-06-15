#include <stdio.h>


int main () {
    int n,i, fatorial;

    scanf ("%d", &n);

    fatorial = 1;

    for (i = 2; i <= n;  i++) {

        fatorial *= i;

    }

    printf ("%d\n", fatorial);

    return 0;
}

