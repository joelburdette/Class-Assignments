#include <iostream>

float getSquare(float); //declares these two
float getCube(float);  //value returning functions
//float square = 3;
//float cube   = 9;
float value;

using namespace std;


int main()
{
 
 cin >> value;
 cout << "the square of " << value << " is "
      << getSquare(value) << endl; //function call
	  
 cout << "the cube of "  << value << " is " 
      << getCube(value) << endl; //function call
	  
	  return 0;
}

float getSquare(float value)
{
 return value * value;
 
}

float getCube(float value)
{
 return value * value * value;
}
