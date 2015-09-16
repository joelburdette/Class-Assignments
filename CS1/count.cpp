// Program Count prompts for, reads, echo prints, and sums a 
// fixed number of integer values.  The sum is printed.

#include <iostream>
using namespace std;

const int  LIMIT = 9;

int main ()
{                                                            
  int counter = 0;                 // Loop-control variable
  int sum = 0;                     // Summing variable          
  int dataValue;               // Input value      
   /** initialize the value of the LOOP-CONTROL VARIABLE */ 
                
                                   
  // Input and sum integer data values. 
  while (counter <= LIMIT/** enter the EXPRESSION */)
  {
    //cout << "Enter an integer value.  Press return."  
         //<< endl;
    //cin >> dataValue;
    sum = sum + dataValue;
    counter++; /** update LOOP-CONTROL VARIABLE */
  }
  cout << "Sum is " << sum << endl;
  return 0;
}
