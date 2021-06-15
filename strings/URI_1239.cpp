#include <iostream>
#include <string>

int main () {
    std::string str;

    while (std::getline (std::cin, str)) {
        int contador1 = 1, contador2 = 1;
        unsigned int i = 0;
        while (str[i] != '\0') {
            if (str[i] == '_') {
                if (contador1 % 2 == 0) {
                    str.replace (i, 1, "</i>");
                } else {
                    str.replace (i, 1,"<i>");
                }
                contador1++;
            } else if (str[i] == '*') {
                if (contador2 % 2 == 0) {
                    str.replace (i, 1, "</b>");
                } else {
                    str.replace (i, 1, "<b>");
                }
                contador2++;
            }
            i++;
        }

        std::cout << str << std::endl;
    }



    return 0;
}

