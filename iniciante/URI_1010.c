#include <stdio.h>

int main(){
	int cod1, cod2, nump1, nump2;
	double v_unit1, v_unit2, total;
	scanf("%d %d %lf", &cod1, &nump1, &v_unit1);
	scanf("%d %d %lf", &cod2, &nump2, &v_unit2);
	total = nump1*v_unit1 + nump2*v_unit2;
	printf("VALOR A PAGAR: R$ %.2lf\n", total);
	return 0;
}
