#include <stdio.h>


int main () {
    int c, i, n;

    scanf ("%d", &c);

    for (i = 0; i < c; i++) {
        scanf ("%d", &n);
        if (n % 2 == 0) {
            printf ("0\n");
        } else {
            printf ("1\n");
        }
    }

    return 0;
}

