#include <stdio.h>
#include <cmath>

int main () {
    int n, temp, i;

    scanf ("%d", &n);

    temp = 1;

    for (i = 1; i <= (n * 2); i++) {

        if (i % 2 != 0) {
            printf ("%d %d %d\n", temp, (int) pow (temp, 2), (int) pow (temp, 3));
        } else {
            printf ("%d %d %d\n", temp, (int) pow (temp, 2) + 1, (int) pow (temp, 3) + 1);
            temp++;
        }

    }

    return 0;
}

