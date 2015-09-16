#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main(void) {
ifstream inFile;
string fileName = "input.cpp";

cout << "Enter input file name: " << endl; 
//cin >> fileName;
cout << fileName;

inFile.open(fileName);

return 0;
}
