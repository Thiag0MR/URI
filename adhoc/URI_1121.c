#include <stdio.h>
#include <stdbool.h>

typedef struct {
    int linha;
    int coluna;
} posicaoInicial;

int main () {
    char tabuleiro [110][110], instrucoes[50100];
    int N, M, S; //linha, coluna, numero de instruções respectivamente
    int olhandoPara, /*1 - Norte, 2 - Leste, 3 - Sul, 4 - Oeste */ numFigurinhas;
    int i, j;
    posicaoInicial pi;
    bool achou;

    /*
    FILE *entrada, *saida;

    entrada = fopen ("entrada.txt", "r");
    saida = fopen ("saida.txt", "w");
    */

    for ( ; ; ) {
        scanf ("%d %d %d", &N, &M, &S);

        if (N == 0 && M == 0 && S == 0) {
            break;
        }

        // Preenche o tabuleiro
        for (i = 0; i < N; i++) {
            //getchar ();
            scanf ("%s", tabuleiro[i]);
        }

        scanf ("%s", instrucoes);

        achou = false;
        // Procuro a posição inicial
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                if (tabuleiro[i][j] == 'N') {
                    olhandoPara = 1;
                    pi.linha = i;
                    pi.coluna = j;
                    achou = true;
                } else if (tabuleiro[i][j] == 'L' ) {
                    olhandoPara = 2;
                    pi.linha = i;
                    pi.coluna = j;
                    achou = true;
                } else if (tabuleiro[i][j] == 'S') {
                    olhandoPara = 3;
                    pi.linha = i;
                    pi.coluna = j;
                    achou = true;
                } else if (tabuleiro[i][j] == 'O') {
                    olhandoPara = 4;
                    pi.linha = i;
                    pi.coluna = j;
                    achou = true;
                }
            }
            if (achou) {
                break;
            }
        }

        numFigurinhas = 0;
        for (i = 0; i < 50100; i++) {
            if (instrucoes[i] == '\0') {
                break;
            } else if (instrucoes[i] == 'D') {
                olhandoPara++;
                if (olhandoPara == 5) {
                    olhandoPara = 1;
                }
            } else if (instrucoes[i] == 'E') {
                olhandoPara--;
                if (olhandoPara == 0) {
                    olhandoPara = 4;
                }
            } else if (instrucoes[i] == 'F') {
                if (olhandoPara == 1) {
                    if ((pi.linha - 1) >= 0 && (tabuleiro[pi.linha - 1][pi.coluna] != '#')) {
                        pi.linha -= 1;
                        if (tabuleiro[pi.linha][pi.coluna] == '*') {
                            numFigurinhas++;
                            tabuleiro[pi.linha][pi.coluna] = '.';
                        }
                    }
                } else if (olhandoPara == 2) {
                    if ((pi.coluna + 1) < M && (tabuleiro[pi.linha][pi.coluna + 1] != '#')) {
                        pi.coluna += 1;
                        if (tabuleiro[pi.linha][pi.coluna] == '*') {
                            numFigurinhas++;
                            tabuleiro[pi.linha][pi.coluna] = '.';
                        }
                    }
                } else if (olhandoPara == 3) {
                    if ((pi.linha + 1) < N && (tabuleiro[pi.linha + 1][pi.coluna] != '#')) {
                        pi.linha += 1;
                        if (tabuleiro[pi.linha][pi.coluna] == '*') {
                            numFigurinhas++;
                            tabuleiro[pi.linha][pi.coluna] = '.';
                        }
                    }
                } else if (olhandoPara == 4) {
                    if ((pi.coluna - 1) >= 0 && tabuleiro[pi.linha][pi.coluna - 1] != '#') {
                        pi.coluna -= 1;
                        if (tabuleiro[pi.linha][pi.coluna] == '*') {
                            numFigurinhas++;
                            tabuleiro[pi.linha][pi.coluna] = '.';
                        }
                    }
                }

            }

        }

        printf ("%d\n", numFigurinhas);

    }
    /*
    fclose (entrada);
    fclose (saida);
    */
    return 0;
}

