#include <stdio.h>

typedef struct sNo {
    int dir;
    int esq;
} No;


int main () {
    No vet[61];
    int i, N, num, contador;
    char letra;


    while (scanf ("%d", &N) != EOF) {

        for (i = 30; i <= 60; i++) {
            vet[i].dir = 0;
            vet[i].esq = 0;
        }

        contador = 0;
        for (i = 0; i < N; i++) {
            scanf ("%d %c", &num, &letra);
            getchar ();
            if (letra == 'D') {
                vet[num].dir += 1;
                if (vet[num].dir != 0 && vet[num].esq != 0) {
                    contador += 1;
                    vet[num].dir -= 1;
                    vet[num].esq -= 1;
                }
            } else {
                vet[num].esq += 1;
                if (vet[num].dir != 0 && vet[num].esq != 0) {
                    contador += 1;
                    vet[num].dir -= 1;
                    vet[num].esq -= 1;
                }
            }
        }

        printf ("%d\n", contador);
    }

    return 0;

}

