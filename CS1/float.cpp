#include <iostream>

float Square(float); //declares these two
float Cube(float);  //value returning functions
float square = 123;
float cube   = 123;
using namespace std;

int main()
{

 cout << "the square of " << square << " is "
      << Square(square)<<endl; //function call
	  
 cout << "the cube of "  << cube << " is " 
      << Cube(cube)<<endl; //function call
	  
	  return 0;
}

float Square(float x)
{
 return x*x;
}

float Cube(float x)
{
 return x*x*x;
}
