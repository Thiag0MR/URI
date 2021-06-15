#include <stdio.h>

int main () {
    int i, impar;

    scanf ("%d", &impar);

    for (i = 0; i <= impar; i++) {
        if (i % 2 != 0) {
            printf ("%d\n", i);
        }
    }

    return 0;
}

