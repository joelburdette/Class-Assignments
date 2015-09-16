#include <iostream>

int Square(int); //declares these two
int Cube(int);  //value returning functions

using namespace std;

int main()
{

 cout << "the square of 27 is "
      << Square(27)<<endl; //function call
	  
 cout << "the cube of 27 is " 
      << Cube(27)<<endl; //function call
	  
	  return 0;
}

int Square(int x)
{
 return x*x;
}

int Cube(int x)
{
 return x*x*x;
}
