#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main () {
    short int i, j;
    int N, contador;
    char** p;
    scanf("%d", &N);
    p = (char**) malloc (N * sizeof (char*));
    if (p == NULL) {
        printf ("Erro");
        exit (1);
    }
    for (i = 0; i < N; i++) {
        p[i] = (char*) malloc (101 * sizeof (char));
        if (p[i] == NULL) {
            printf ("Erro");
            exit (1);
        }
    }
    for (i = 0; i < N; i++) {
        getchar ();
        scanf("%s", p[i]);
    }
    for (i = 0; i < N; i++) {
        contador = 0;
        for (j = 0; j < strlen (p[i]); j++) {
            switch (p[i][j]) {
                case '1': contador += 2; break;
                case '2': contador += 5; break;
                case '3': contador += 5; break;
                case '4': contador += 4; break;
                case '5': contador += 5; break;
                case '6': contador += 6; break;
                case '7': contador += 3; break;
                case '8': contador += 7; break;
                case '9': contador += 6; break;
                case '0': contador += 6; break;
            }
        }
        printf ("%d leds\n", contador);
    }
    for (i = 0; i < N; i++) {
        free (p[i]);
    }
    free (p);
    return 0;
}

