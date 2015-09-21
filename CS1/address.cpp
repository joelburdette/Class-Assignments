#include <iostream>
using namespace std;

void ref(double *x);
  

int main(void)
{

double x;
cout << "x was " << x << endl; 
ref(&x);
cout << "x is now " << x << endl;

}

void ref(double *a)
{
 *a = 3.14;
}
