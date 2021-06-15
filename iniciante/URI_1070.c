#include <stdio.h>

int main () {
    int x, i, temp;

    scanf ("%d", &x);

    i = 1;
    temp = x;
    while (i <= 6) {
        if (temp % 2 != 0) {
            printf ("%d\n", temp);
            temp += 2;
            i++;
        } else {
            temp++;
        }

    }

    return 0;

}

