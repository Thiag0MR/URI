# include <stdio.h>
# include <stdlib.h>

/*
Retorna o MDC entre dois inteiros
*/
int MDC (int a, int b) {

    if ( b == 0) {
        return a;
    }
    return MDC (b, a % b);
}

int main () {

    int N, N1, N2, D1, D2, X, Y, mdc, i;
    char op;

    scanf ("%d", &N);

    for (i = 0; i < N; i++) {
        scanf ("%d / %d %c %d / %d", &N1, &D1, &op, &N2, &D2);

        switch (op) {
            case '+':   X = (N1*D2) + (N2*D1);
                        Y = D1*D2;
                        break;

            case '-':   X = (N1*D2) - (N2*D1);
                        Y = D1*D2;
                        break;

            case '*':   X = N1*N2;
                        Y = D1*D2;
                        break;

            case '/':   X = N1*D2;
                        Y = D1*N2;
                        break;
        }

        mdc = MDC (abs (Y), abs (X));

        printf ("%d/%d = %d/%d\n", X, Y, X/mdc, Y/mdc);
    }

    return 0;

}

