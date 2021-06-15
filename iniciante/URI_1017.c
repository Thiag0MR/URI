#include <stdio.h>

int main(){
  float t_gasto, vel_media, litros;
  scanf("%f %f", &t_gasto, &vel_media);
  litros = (vel_media/12)*t_gasto;
  printf("%.3f\n", litros);
  return 0;
}
