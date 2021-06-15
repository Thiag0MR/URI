#include <stdio.h>

int main () {
    char meses[12][12] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    int num;

    scanf ("%d", &num);

    printf ("%s\n", meses[num-1]);

    return 0;
}

