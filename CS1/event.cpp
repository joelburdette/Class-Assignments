// Program Event prompts for, reads, and sums integer
// values until a negative number is read.  The input
// values and the sum are printed.

#include <iostream>
using namespace std;

int main ()
{
  int  sum = 0;		// Summing variable
  int  dataValue;	// Input value 
  int  counter = 0;
  cout << "To stop processing, enter a negative"
       << " value."  << endl;
  cout << " Enter an integer value; press return."  
       << endl;
  // Read first data value to prepare for loop. 
  cin >> dataValue; /** PRIMING READ */

  // Input and sum integer data values 
  while (dataValue >= 0/** EXPRESSION */)
  {                                                  
    sum = sum + dataValue;
    cout << "Enter an integer value; press return."  
         << endl;
    cin >> dataValue;
	/** read input from user */
  }
  cout << "Sum is " << sum << endl;
  return 0;
}                                                    
