#include <stdio.h>

int main(){
  float X, Y, total;
  scanf("%f %f", &X, &Y);
  total = X/Y;
  printf("%.3f km/l\n", total);
  return 0;
}
