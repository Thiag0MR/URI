#include <stdio.h>

int main () {
    int H1, H2, M1, M2, h, m;
    scanf ("%d %d %d %d", &H1, &M1, &H2, &M2);
    while ((H1 != 0) || (H2 != 0) || (M1 != 0) || (M2 !=0)) {
        if (H2 < H1) {
            H2 += 24;
        }
        if (H2 == H1) {
            if (M2 <= M1)
                H2 += 24;
        }
        if (M2 < M1) {
            M2 += 60;
            H2 -= 1;
        }
        h= H2 - H1;
        m = M2 - M1;
        printf ("%d\n", (h*60) + m);
        scanf ("%d %d %d %d", &H1, &M1, &H2, &M2);
    }
    return 0;
}

