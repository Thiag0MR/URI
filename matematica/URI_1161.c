#include <stdio.h>

int main () {
    int M, N, i;
    long long int fatorialM, fatorialN, soma;

    while (scanf("%d %d", &M, &N) != EOF) {
        fatorialM = 1;
        fatorialN = 1;
        soma = 0;
        for (i = 1; i <= M; i++) {
            fatorialM *= i;
        }
        for (i = 1; i <= N; i++) {
            fatorialN *= i;
        }
        soma = fatorialM + fatorialN;
        printf ("%lld\n", soma);
    }

    return 0;
}

