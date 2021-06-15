#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* maisc_minusc (char* str, int n) {
    short int i;
    for (i = 0; i < n; i++) {
        if ((str [i] > 64 && str [i] < 91) || (str [i] > 96 && str [i] < 123)) {
            str [i] += 3;
        }
    }
    return str;
}

char* reverte_str (char* str, int n) {
    short int i, j;
    char* aux;
    aux = (char*) malloc ((n + 1) * sizeof (char));
    strcpy (aux, str);
    j = n - 1;
    for (i = 0; i <= j ; i++) {
        str [i] = aux [ j - i];
    }
    free (aux);
    return str;
}

char* metade_str (char* str, int n) {
    short int i, j;
    j = (n / 2) + (n % 2);
    if (n % 2 == 0)
        i = j;
    else {
        i = j - 1;
    }
    for (i ; i < n; i++) {
        str [i] -= 1;
    }
    return str;
}

int main () {
    int N, i;
    char** str;
    scanf ("%d", &N);
    str = (char**) malloc (N * sizeof (char*)); //cria uma matriz com N linhas
    if (str == NULL) {
        printf ("Erro na alocação \n");
        exit (1);
    }
    for (i = 0; i < N; i++) {
        str[i] = (char*) malloc (1001 * sizeof (char));// 1000 colunas
        if (str [i] == NULL) {
            printf ("Erro na alocação \n");
            exit (1);
        }
    }
    for (i = 0; i < N; i++) {
        getchar ();
        scanf ("%[^\n]", str[i]);
    }
    for (i = 0; i < N; i++) {
        str [i] = maisc_minusc (str [i], strlen (str [i]));
        str[i] = reverte_str (str [i], strlen (str [i]));
        str[i] = metade_str (str [i], strlen (str [i]));
        printf ("%s\n", str [i]);
    }
    for (i = 0; i < N; i++) {
        free (str[i]);
    }
    free (str);
    return 0;
}

