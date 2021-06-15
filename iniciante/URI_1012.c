#include <stdio.h>
#include <math.h>

int main(){
	double A, B, C, pi = 3.14159, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
	scanf("%lf %lf %lf", &A, &B, &C);
	TRIANGULO = (A*C)/2.0;
	printf("TRIANGULO: %.3lf\n", TRIANGULO);
	CIRCULO = pi*pow(C,2);
	printf("CIRCULO: %.3lf\n", CIRCULO);
	TRAPEZIO = ((A+B)*C)/2.0;
	printf("TRAPEZIO: %.3lf\n", TRAPEZIO);
	QUADRADO = pow(B,2);
	printf("QUADRADO: %.3lf\n", QUADRADO);
	RETANGULO = A*B;
	printf("RETANGULO: %.3lf\n", RETANGULO);
	return 0;
}
