#include <stdio.h>

typedef struct sData {
    int d; // dia
    int h; // hora
    int m; // minuto
    int s; // segundo
} Data;

int transformaEmSegundos (Data dt) {
    return (dt.h*3600) + (dt.m*60) + dt.s;
}

void transformaEmHoraMinutoSegundo (Data* dt, int segundos) {
    dt->d = segundos/86400;
    dt->h = (segundos % 86400) / 3600;
    dt->m = ((segundos % 86400) % 3600) / 60;
    dt->s = ((segundos % 86400) % 3600) % 60;
}


int main () {
    Data dt1, dt2, dt3;
    int seg1, seg2, seg3, dias;


    scanf ("Dia %d", &dt1.d);
    scanf ("%d : %d : %d", &dt1.h, &dt1.m, &dt1.s);
    scanf (" Dia %d", &dt2.d);
    scanf ("%d : %d : %d", &dt2.h, &dt2.m, &dt2.s);

    if ((dt2.d - dt1.d) == 0) {
        seg1 = transformaEmSegundos (dt1);
        seg2 = transformaEmSegundos (dt2);
        transformaEmHoraMinutoSegundo (&dt3, seg2 - seg1);
    } else if ((dt2.d - dt1.d) == 1) {
        seg1 = transformaEmSegundos (dt1);
        seg2 = transformaEmSegundos (dt2);
        seg3 = (86400 - seg1) + seg2;
        transformaEmHoraMinutoSegundo (&dt3, seg3);
    } else {
        dias = (dt2.d - dt1.d) - 1;
        seg1 = transformaEmSegundos (dt1);
        seg2 = transformaEmSegundos (dt2);
        seg3 = (86400 * dias) + (86400 - seg1) + seg2;
        transformaEmHoraMinutoSegundo (&dt3, seg3);
    }

    printf ("%d dia(s)\n", dt3.d);
    printf ("%d hora(s)\n", dt3.h);
    printf ("%d minuto(s)\n", dt3.m);
    printf ("%d segundo(s)\n", dt3.s);

    return 0;
}

