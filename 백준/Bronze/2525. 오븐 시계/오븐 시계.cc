#include <iostream>
using namespace std;

int main() {
    int h, m;
    cin >> h >> m;

    int c;
    cin >> c;

    if (m + c > 59) {
        h += (m + c) / 60;

        if (((m + c) % 60) == 0) m = 0;
        else m = (m + c) % 60;

    }
    else m += c;

    if (h > 23) h -= 24;


    cout << h << ' ' << m;
    return 0;
}