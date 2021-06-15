#include <stdio.h>

int main(){
  double valorf, aux1;
  int valord, aux2;
  scanf("%lf", &valorf);
  if(valorf<=1000000.00 && valorf>=0.00){
    valord = valorf;
    printf("NOTAS:\n");
    printf("%d nota(s) de R$ 100.00\n", valord/100);
    printf("%d nota(s) de R$ 50.00\n", (valord%100)/50);
    printf("%d nota(s) de R$ 20.00\n", ((valord%100)%50)/20);
    printf("%d nota(s) de R$ 10.00\n", (((valord%100)%50)%20)/10);
    printf("%d nota(s) de R$ 5.00\n", ((((valord%100)%50)%20)%10)/5);
    printf("%d nota(s) de R$ 2.00\n", (((((valord%100)%50)%20)%10)%5)/2);
    aux1 = ((((((valord%100)%50)%20)%10)%5)%2) + (valorf-valord);
    aux2 = aux1 * 100;
    printf("MOEDAS:\n");
    printf("%d moeda(s) de R$ 1.00\n", aux2/100);
    printf("%d moeda(s) de R$ 0.50\n", (aux2%100)/50);
    printf("%d moeda(s) de R$ 0.25\n", ((aux2%100)%50)/25);
    printf("%d moeda(s) de R$ 0.10\n", (((aux2%100)%50)%25)/10);
    printf("%d moeda(s) de R$ 0.05\n", ((((aux2%100)%50)%25)%10)/5);
    printf("%d moeda(s) de R$ 0.01\n", (((((aux2%100)%50)%25)%10)%5)/1);
  }
  return 0;
}
