#include <iostream>
#include<cmath>

float average(float,float,float);
using namespace std;

int main()
{ 
     float a; 
     float b;
     float c;
     float avg;
	 
	 cout << "please enter your values to find the average" << endl;
	  cout << "What will A be?" << endl;
	  cin >> a;
	  cout << "What will B be?" << endl;
      cin >> b;
	  cout << "And what will C be?" << endl;
      cin >> c;
	  cout <<"thank you,"<< endl;
	  avg = average(a,b,c);
	  cout <<"Here are your values " << a << " " << b << " "<< c << endl;
	  cout <<"Your average is:" << avg << endl;
	  return 0;
}

float average( float a, float b, float c)
{
  float avg;
  avg = sqrt(b*b-4.0*a*c);
  return avg;
}
