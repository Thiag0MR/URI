# include <stdio.h>

// Imprime os números da sequência de fibonacci até um inteiro n
int fibonacci (int n) {

    int primeiro = 0, segundo = 1, aux;

    while (n != 0) {
        printf ("%d", primeiro);
        if (n != 1) {
            printf (" ");
        }
        aux = primeiro;
        primeiro = segundo;
        segundo += aux;
        n--;
    }

    printf("\n");

}

int main () {
    int N;

    scanf ("%d", &N);

    fibonacci (N);

    return 0;
}

