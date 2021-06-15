#include <stdio.h>
#include <stdbool.h>

int main () {
    int Q, D, P, numPaginas;

    while (true) {
        scanf ("%d", &Q);
        if (Q == 0) {
            break;
        }
        scanf("%d", &D);
        if (D == 0) {
            break;
        }
        scanf("%d", &P);
        if (P == 0) {
            break;
        }
        numPaginas = (-(P*D*Q))/(-P + Q);
        if (numPaginas > 1) {
            printf ("%d paginas\n",  numPaginas);
        } else {
            printf ("%d pagina\n",  numPaginas);
        }
    }

    return 0;
}

