#include <iostream>

int main () {
    unsigned char vars[26];

    for (int i = 0; i < 26; i++) {
        vars[i] = static_cast<char> (97 + i);
    }

    for (int i = 0; i < 26; i++) {
        std::cout << static_cast <int> (vars[i]) << " e " << vars[i] << std::endl;
    }

    return 0;
}
