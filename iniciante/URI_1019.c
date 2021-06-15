#include <stdio.h>

int main(){
  int seg, h, m, s;
  scanf("%d", &seg);
  h = seg/3600;
  m = (seg % 3600)/60;
  s = (seg % 3600)%60;
  printf("%d:%d:%d\n", h, m, s);
  return 0;
}
