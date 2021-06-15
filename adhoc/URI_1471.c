#include <stdio.h>
#include <stdlib.h>

int main () {
    int N, R, entrada, i;
    int *v;

    while (scanf("%d %d", &N, &R) != EOF) {
        v = (int*) calloc (N, sizeof (int));
        for (i = 0; i < R; i++) {
            scanf("%d", &entrada);
            v[entrada-1] = 1;
        }
        if (N == R ) {
            printf ("*");
        } else {
            for (i = 0; i < N; i++) {
                if (!v[i]) {
                    printf ("%d ", i+1);
                }
            }
        }
        printf ("\n");
        free(v);
    }

    return 0;
}

