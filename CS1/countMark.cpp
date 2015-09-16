// Program CountMarks counts punctuation marks in a file.
#include <iostream>
#include <fstream>
using namespace std;

int main ()
{
  ifstream  inData;
  char symbol;
  int  periodCt = 0;
  int  commaCt = 0;
  int  questionCt = 0;
  int  colonCt = 0;
  int  semicolonCt = 0;
  inData.open("switch.dat");
  /* FILL IN */
  //char  value;
   
  inData >> symbol;
   //while (value != EOF)
   //{
   //symbol = value;  
  // cout << value;
   //inData >> value;

   //}
   //break;
  while (inData)
  {
	//symbol = value;  
	
	if (symbol == '.')
	{
	  periodCt++;
	}else if (symbol == ',')
	{
	  commaCt++;
	}else if (symbol == '?')
	{
	  questionCt++;	  
	}else if (symbol == ':')
	{
	  colonCt++;
    }else if (symbol == ';')
	{
	  semicolonCt++;
    }
    inData >> symbol;
  }
	cout << "There are lots of symbols in this file:  ..;;??.,.,.,?:::  ." << endl;
	cout << "periodCt= " << periodCt <<endl;
	cout << "commaCt= " << commaCt <<endl;
	cout << "questionCt= " << questionCt <<endl;
	cout << "colonCt= " << colonCt <<endl;
	cout << "semicolonCt= " << semicolonCt <<endl;
 return 0;
}
