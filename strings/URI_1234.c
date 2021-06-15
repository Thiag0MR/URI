#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main () {
    char str [51];
    short int i;
    int contador;
    while (scanf("%[^\n]%*c", str) != EOF) {
        contador = 0;
        for (i = 0; i < strlen (str); i++) {
            if (str [i] != ' ') {
                if (contador % 2 == 0) {
                    str [i] = toupper (str [i]);
                } else {
                    str [i] = tolower (str [i]);
                }
            contador++;
            }
        }
        printf ("%s\n", str);
    }
    return 0;
}

