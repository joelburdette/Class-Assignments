#include <iostream>
using namespace std;

void ref(float *i);
  

int main(void)
{

float i = 3.14;
cout << "i was " << i << endl; 
ref(&i);
cout << "i is now " << i << endl;
}

void ref(float *i)
{
 *i = *i * 2;
}
