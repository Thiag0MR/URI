#include <stdio.h>

int main () {
    int gridLargada[25], gridChegada[25];
    int i, j, k, N, num, temp;

    while (scanf ("%d", &N) != EOF) {
        

        for (j = 0; j < N; j++) {
            scanf ("%d", &gridLargada[j]);
        }

        for (j = 0; j < N; j++) {
            scanf ("%d", &gridChegada[j]);
        }

        num = 0;
        for (j = 0; j < N; j++) {
            if (gridLargada[j] != gridChegada[j]) {
                k = 0;
                while (gridLargada[j] != gridChegada[k]) {
                    k++;
                }
                while (k != j) {
                    temp = gridChegada[k];
                    gridChegada[k] = gridChegada[k-1];
                    gridChegada[k-1] = temp;
                    k--;
                    num++;
                }
            }
        }

        printf ("%d\n", num);
    }

    return 0;
}

