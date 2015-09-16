// Program Pressure prints appropriate messages based
// on a pressure reading read from a file.  Processing
// continues until the plant is evacuated because of
// a pressure reading over 100. 

#include <iostream>
#include <fstream>
using namespace std;

int main ()
{
  int  pressure;
  ifstream data;
  //data.open("pressure.d3");
   data.open("pressure.d2");

 data >> pressure;
  //cout << pressure;  
 
 while (data) /* LOOP TO BE FILLED IN */
{
   if (pressure < 100) 
   {//cout << "Pressure is less 100, remain calm" << endl;
     cout << "Pressure is " << pressure << endl;
      data >> pressure;
   } else{
      cout << "Evacuate! pressure is " << pressure << endl;
      return 0;   
   }
 //data >> pressure;
 }
                                            
                                                            
 //cout << "Evacuate!" << endl;    /* FILL IN Code to print the message */

    return 0;
}                                                                               
