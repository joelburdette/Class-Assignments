// There are 3 bugs in the programs. After fixed, the output of the program is

//$ ./a.exe 
//55
//55

//Program Bugs demonstrates bugs in loops and switches.

#include <iostream>
#include <fstream>
using namespace std;

int main ()
{
  ifstream  inData;

  int  value;
  bool  fileFound;

  inData.open("bugs.dat");
  if (inData)
    fileFound = true;
  else
	fileFound = false;
  switch (fileFound)
  {
	case false : cout  << "bugs.dat was not found."  << endl;
	case true  :
    // do-while loop
    {
      int  counter = 1;
      int  sum = 0;
      do
      {
        inData  >> value;
        sum = sum + value;
		counter++;
      } while (counter <= 10);
      cout  << sum  << endl;
      
	}
    // for loop
    {
      int  sum = 0;
      for (int counter = 1; counter <= 10; counter++)
      {
        inData  >> value;
        sum = sum + value;
        //counter++;
      }
      cout  << sum  << endl;
    }
	break;
  }
  return 0;
}


