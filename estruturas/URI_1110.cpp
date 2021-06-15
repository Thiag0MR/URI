#include <iostream>
#include <deque>
#include <queue>

int main () {

    while (true) {
        std::deque<int> d;
        std::queue<int> f;
        int n;

        std::cin >> n;

        if (n == 0)
            break;

        for (int i = 1; i <= n; i++) {
            d.push_back (i);
        }

        while (d.size() >= 2) {

            f.push (d.front());
            d.pop_front();

            d.push_back (d.front ());
            d.pop_front ();
        }
        std::cout << "Discarded cards:";
        while ( !f.empty() ) {
            if (f.size() == 1) {
                std::cout << " " << f.front();
            } else {
                std::cout << " " << f.front() << ",";
            }

            f.pop();
        }

        std::cout << "\nRemaining card: " << d.front() << std::endl;
        d.pop_back ();

    }




    return 0;
}

