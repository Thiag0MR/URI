#include <stdio.h>
#include <math.h>

int maior(int a, int b){
	return (a+b+abs(a-b))/2;
}
int main(){
	int a, b, c, s_maior, f_maior;
	scanf("%d %d %d", &a, &b, &c);
	s_maior = maior(a,b);
	f_maior = maior(s_maior,c);
	printf("%d eh o maior\n", f_maior);
	return 0;
}
