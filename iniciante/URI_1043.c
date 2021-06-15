#include <stdio.h>

int main(){
	double A,B,C, aux1, aux2, aux3;
	scanf("%lf %lf %lf", &A, &B, &C);
	aux1 = B-C;
	aux2 = A-C;
	aux3 = A-B;
	if ((B-C)<0){
		aux1 = (-1)*(B-C);
	}
	if ((A-C)<0){
		aux2 = (-1)*(A-C);
	}
	if ((A-B)<0){
		aux3 = (-1)*(A-B);
	}
	if (A>aux1 && B+C>A){
		printf("Perimetro = %.1lf\n", A+B+C);
	}else if (B>aux2 && A+C>B){
		printf("Perimetro = %.1lf\n", A+B+C);
	}else if (C>aux3 && A+B>C){
		printf("Perimetro = %.1lf\n", A+B+C);
	}else{
		printf("Area = %.1lf\n", ((A+B)*C)/2);
	}
	return 0;
}
