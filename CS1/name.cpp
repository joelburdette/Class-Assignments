#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main(void) {
ofstream outFile;
string fileName;
//string line;

cout << "Enter output file name: " << endl;
cin >> fileName;
outFile.open();


outFile.close();

return 0;
}
