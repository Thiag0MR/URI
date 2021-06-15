#include <stdio.h>

int main(){
	int num, horas_trab;
	double valor_hora, salario;
	scanf("%d %d %lf", &num, &horas_trab, &valor_hora);
	salario = horas_trab * valor_hora;
	printf("NUMBER = %d\n", num);
	printf("SALARY = U$ %.2lf\n", salario);
	return 0;
}
