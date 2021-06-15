# include <stdio.h>

// Calcula o MDC entre dois inteiros
int MDC (int a, int b) {

    int temp, r;
    
    // Caso b seja maior que a, os valores são trocados
    if (b > a) {
        temp = b;
        b = a;
        a = temp;
    }

    while (b != 0) {
        r = a % b;
        a = b;
        b = r;
    }

    return a;
}

int main () {
    int N, F1, F2, i;

    scanf ("%d", &N);

    for (i = 0; i < N; i++) {
        scanf ("%d %d", &F1, &F2);

        printf ("%d\n", MDC (F1, F2));
    }

    return 0;
}

