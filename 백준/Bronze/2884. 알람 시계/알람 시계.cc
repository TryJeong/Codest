#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
	int h, m;

	cin >> h >> m;

	if (h <= 23 && m >= 45) {
		cout << h << " " << m - 45;
	}
	else if (h >= 1 && h <= 23 && m < 45) {
		cout << h - 1 << " " << m + 15;
	}
	else if (h == 0 && m < 45) {
		cout << 23 << " " << m + 15;
	}
	return 0;
}