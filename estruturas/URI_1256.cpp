#include <iostream>
#include <vector>

int main () {
    int m, c, n;

    std::cin >> n;

    for (int i = 0; i < n; i++) {
        std::cin >> m >> c;

        std::vector <std::vector<int> > v (m);

        for (unsigned int i = 0; i < c; i++) {
            int aux;
            std::cin >> aux;
            v[aux % m].push_back (aux);
        }

        for (unsigned int i = 0; i < v.size(); i++) {
            std::cout << i << " " << "->";
            for (unsigned int j = 0; j < v[i].size (); j++) {
                std::cout << " " << v[i].at(j) << " ->";
            }
            std::cout << " \\" << std::endl;
        }

        if (i < n - 1)
            std::cout << std::endl;
        
        
    }


    return 0;
}
