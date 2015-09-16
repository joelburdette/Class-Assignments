// Program SumDigits prompts for and reads a one-digit number.
// Values between 0 and the digit (inclusive) are summed.

#include <iostream>
using namespace std;

int main ()
{
  int counter;	// Loop-control variable
  int sum;		// Running sum
  int digit;

  cout << "Enter a one-digit number; press return."
       << endl;
  cin >> digit;
  counter = 0; /* TO BE FILLED IN */                          
  sum  = 0;     /* TO BE FILLED IN */                          
   
  while (counter <=4)/* TO BE FILLED IN  */                                                   
  {                                                       
    sum = sum + digit;/*  TO BE FILLED IN */                               
    cin >> digit;  
    counter++;  
  }
  cout << "Sum of digits between 0 and "
       << digit  << " is "  << sum  << endl;
  return 0;
}
