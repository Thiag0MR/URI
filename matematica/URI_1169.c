#include <stdio.h>

unsigned long long int quant_gramas (int x) {
    short int j;
    unsigned long long int aux;
    aux = 1;
    for (j = 0; j < x; j++) {
        aux = aux * 2;
    }
    return aux / 12;

}

int main () {
    short int i;
    int N, X;
    unsigned long long int kg;
    scanf ("%d", &N);
    for (i = 0; i < N; i++) {
        scanf ("%d", &X);
        if (X == 64) {
            printf("1537228672809129 kg\n");
        } else {
            kg = (quant_gramas (X) / 1000);
            printf ("%llu kg\n", kg);
        }
    }
    return 0;
}

