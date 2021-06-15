#include <stdio.h>
#include <string.h>

int main () {
    char string[100];
    int i, j, N, tam, aux;

    scanf ("%d", &N);

    for (i = 0; i < N; i++) {
        aux = 0;
        getchar ();
        scanf ("%[^\n]", string);


        tam = strlen (string);

        for (j = (tam/2) - 1; j >= 0; j--) {
            printf ("%c", string[j]);
        }
        for (j = tam - 1; j >= (tam/2); j--) {
            printf ("%c", string[j]);
        }

        printf ("\n");
    }

    return 0;
}

