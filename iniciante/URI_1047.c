#include <stdio.h>

int main () {
    int h_inicial, m_inicial, h_final, m_final, h_total, m_total;
    scanf ("%d%d%d%d", &h_inicial, &m_inicial, &h_final, &m_final);
    if (h_final < h_inicial) {
        h_final += 24;
    }
    if (m_final < m_inicial) {
        m_final += 60;
        h_final -= 1;
    }
    if (h_inicial == h_final && m_inicial == m_final) {
        printf ("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
    } else {
        printf ("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h_final - h_inicial, m_final - m_inicial);
    }
    return 0;
}

