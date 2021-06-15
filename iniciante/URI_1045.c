#include <stdio.h>

int main () {
    double A, B, C, AUX;
    scanf( "%lf%lf%lf", &A, &B, &C);
    if (B > A && B > C) {
        AUX = A;
        A = B;
        B = AUX;
    } else if (C > A && C > B) {
        AUX = A;
        A = C;
        C = AUX;
    }

    if (A >= (B + C))
        printf ("NAO FORMA TRIANGULO\n");
    else if ((A*A) == (B*B) + (C*C))
        printf ("TRIANGULO RETANGULO\n");
    else if ((A*A) > (B*B) + (C*C))
        printf ("TRIANGULO OBTUSANGULO\n");
    else if ((A*A) < (B*B) + (C*C))
        printf ("TRIANGULO ACUTANGULO\n");

    if (A == B && A == C && B == C)
        printf ("TRIANGULO EQUILATERO\n");
    else if (A == B || A == C || B == C)
        printf ("TRIANGULO ISOSCELES\n");


    return 0;
}

