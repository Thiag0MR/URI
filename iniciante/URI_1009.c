#include <stdio.h>

int main(){
	char nome[20];
	double total_vendas, salario, total;
	scanf("%s", nome);
	fflush(stdin);
	scanf("%lf %lf", &salario, &total_vendas);
	total = (0.15*total_vendas)+salario;
	printf("TOTAL = R$ %.2lf\n", total);
	return 0;
}
