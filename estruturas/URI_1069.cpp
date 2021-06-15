#include <iostream>
#include <stack>
#include <cstdio>

int main () {

    int n;

    std::cin >> n;

    for (int i = 0; i < n; i++) {
        std::string str;
        std::stack<char> pilha;

        std::cin >> str;
        //getchar();

        int contador = 0;
        for (unsigned int j = 0; j < str.length(); j++) {
            switch (str[j]) {
                case '<':
                    pilha.push (str[j]); break;
                case '>':
                    if (!pilha.empty()) {
                        if (pilha.top() == '<') {
                            pilha.pop();
                            contador++;
                        }
                    }
                    break;
            }
        }

        std::cout << contador << std::endl;
    }

    return 0;
}

