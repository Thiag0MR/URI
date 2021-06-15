#include <stdio.h>
#include <stdlib.h>

int ** alocar_matriz (int N) {
    int **mat;
    int i;

    mat = (int **) calloc (N, sizeof (int *));
    if (mat == NULL) {
        printf ("Erro na alocação\n");
        return NULL;
    }
    for (i = 0; i < N; i++) {
        mat[i] = (int *) calloc (N, sizeof (int));
        if (mat[i] == NULL) {
            printf ("Erro na alocação\n");
            return NULL;
        }
    }
    return mat;
}

void liberar_matriz (int** mat, int N) {
    int i;

    for (i = 0; i < N; i++) {
        free (mat[i]);
    }
    free (mat);
}


int main () {
    int N, i, j, a, b;
    int **mat;

    while (1) {
        scanf ("%d", &N);

        if (N == 0) {
            break;
        }
        a = 1;
        b = N;

        mat = alocar_matriz (N);
        if (mat == NULL) {
            exit (1);
        }

        // Preenche a matriz com os valores
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                if (a < b) {
                    if (j >= a && j <= b) {
                        mat[i-1][j-1] = a;
                    }
                } else {
                    if (j >= b && j <= a) {
                        mat[i-1][j-1] = b;
                    }
                }
            }
            a++;
            b--;
        }

        // Preenche os valores que não foram preenchidos no laço anterior
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (mat[i][j] == 0) {
                    mat [i][j] = mat [j][i];
                }
            }
        }

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (j == (N - 1)) {
                    printf ("%3d", mat[i][j]);
                } else {
                    printf ("%3d ", mat[i][j]);
                }
            }
            printf ("\n");
        }

        printf ("\n");

        liberar_matriz (mat, N);
    }

    return 0;
}

