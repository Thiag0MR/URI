#include <iostream>

int main () {
    int num_chamadas[40] = {0,0,2};
    int fib[40] = {0,1,1};
    int n, index = 2;

    std::cin >> n;

    for (int i = 0; i < n; i++) {
        int x;

        std::cin >> x;

        if (x <= index) {
            std::cout << "fib(" << x << ") = " << num_chamadas[x] << " calls = " <<  fib[x] << std::endl;
        } else {
            for (int j = index + 1; j <= x; j++) {
                num_chamadas[j] = num_chamadas[j - 1] + num_chamadas[j - 2] + 2;
                fib[j] = fib[j - 1] + fib[j - 2];
            }

            index = x;

            std::cout << "fib(" << x << ") = " << num_chamadas[x] << " calls = " <<  fib[x] << std::endl;
        }
    }

    return 0;
}

