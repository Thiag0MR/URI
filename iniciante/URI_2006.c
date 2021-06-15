#include <stdio.h>

int main () {
    int t, num, i, contador;

    scanf ("%d", &t);

    contador = 0;
    
    for (i = 0; i < 5; i++) {
        scanf ("%d", &num);
        if (num == t) {
            contador++;
        }
    }
    
    printf ("%d\n", contador);
    
    return 0;
}
