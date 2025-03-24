#include <iostream>

using namespace std;

int main() {
	double a; // float의 경우 32bit(4byte)의 자료형 이기에 오류가 남. 이에 64bit(8byte)인 double 자료형을 사용해야 함. 10-9까지의 오차범위 때문. 
	double b;

	cin >> a;
	cin >> b;

	cout.precision(9); // precision은 출력 할 실수 전체 자리수를 n자리로 표현 하는 것
	cout << fixed; // fixed 는 고정 소수점 표기방식.
	cout << a / b << endl;
	return 0;
}