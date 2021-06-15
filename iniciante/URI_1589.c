#include <stdio.h>


int main () {
    int r1, r2, n, i;


    scanf ("%d", &n);

    for (i = 0; i < n; i++) {
        scanf ("%d %d", &r1, &r2);
        printf ("%d\n", r1 + r2);
    }

    return 0;
}

