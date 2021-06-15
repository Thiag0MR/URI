#include <stdio.h>
#include <stdbool.h>

int main () {
    int N, i, j, a;
    bool aux;

    for ( ; ; ) {
        scanf ("%d", &N);

        if (N == 0) {
            break;
        }

        for (i = 0; i < N; i++) {
            aux = false;
            a = i + 1;
            for (j = 0; j < N; j++) {
                if (j == (N - 1)) {
                    printf ("%3d", a);
                } else {
                    printf ("%3d ", a);
                }

                if (i == j) {
                    aux = true;
                }

                if (aux) {
                    a++;
                } else {
                    a--;
                }
            }
            printf ("\n");
        }
        printf ("\n");
    }

    return 0;
}

