#include <iostream>
#include <stack>

int main () {
    std::string str;
    std::stack<char> pilha;
    bool aux = false;

    while (std::cin >> str) {
        for (unsigned int i = 0; i < str.length(); i++) {
            aux = false;
            switch (str[i]) {
                case '(':
                    pilha.push (str[i]);
                    break;
                case ')':
                    if (!pilha.empty()) {
                        if (pilha.top() == '(') {
                            pilha.pop();
                        } else {
                            aux = true;
                        }
                    } else {
                        aux = true;
                    }
                    break;
            }
            if (aux) {
                break;
            }
        }

        if (!pilha.empty()) {
            std::cout << "incorrect" << std::endl;
            while (!pilha.empty()) {
                pilha.pop();
            }
        } else if (aux) {
            std::cout << "incorrect" << std::endl;
        } else {
            std::cout << "correct" << std::endl;
        }
    }

    return 0;
}

