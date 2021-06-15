#include <stdio.h>

int main () {
    int h_inicial, h_final;
    scanf ("%d%d", &h_inicial, &h_final);
    if (h_final < h_inicial) {
        h_final += 24;
    }
    if (h_inicial == h_final) {
        printf ("O JOGO DUROU 24 HORA(S)\n");
    }else {
        printf ("O JOGO DUROU %d HORA(S)\n", (h_final - h_inicial));
    }
    return 0;
}

