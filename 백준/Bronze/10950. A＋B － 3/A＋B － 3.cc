#include <iostream>

using namespace std;

int main(int argc, char const* argv[]) {
	int t, a, b;

	cin >> t; 

	for (int i = 0; i < t; i++) {
		cin >> a >> b;
		cout << a + b << "\n";
	}
	return 0;
}