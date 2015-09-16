/*
Programming Exercise 1

Due: 23:59 Thu 09/19/2013

A local flooring store needs a program that will give a customer a quote of how
much it will cost for a room in their house to have new carpet installed. 
The cost of the carpet is sold per square yard along with the pad. 
Installation cost is charged the normal standard rate per room. 
To give the quote the user needs to know the size of the room, 
the cost per square yard of the carpet desired and the name of the 
customer. The output needs to have the customer’s name and total cost.

Bring the questions you have in order to complete this program to the class on Thu 09/12/2013.

Your questions may include
* What is the standard rate of pay for installing a room of carpet?
* What about sales tax?

Sample output: [to be provided after the class on Thu 09/12/2013]
    Jones, Joe:
    ------------------------------
    Supply Cost:  $509.013
    Install Cost: $100
    Tax:          $41.9936
    ------------------------------
    Total Due:    $651.007

Grading criteria:
    * compile and run
    * descriptive variable names
    * get room dimensions in feet
    * get carpet unit cost per square yard
    * no unnecessary input other than
        * room dimension
        * carpet unit cost
        * customer name
    * separator lines (character of your choice)

Deliverables (submit throughput BlackBoard):
* .cpp
*/
 
 #include <iostream>
 #include <fstream>
 using namespace std;
 
 string inFirst = "";  //variables
 string inLast = "";
 
 float taxRate = 8.25; 
 float installCost = 100;
 float totalTax;
 float inLength;
 float inWidth;
 float totalArea;
 float inCostPerYard;
 float outCost;
 float totalCost;
 
 void area();  //methods
 void supplyCost();
 void salesTax();
 void endTotal();

int main()
{ 
    //output and input
	cout << "Hello there and welcome to Carp-O-Matic!  What is your first name? " << endl;	 
	cin >> inFirst;
	cout << "Great, and your last name?" <<endl;
	cin >> inLast;
	cout << "What is the length of the room in feet?" << endl;
	cin >> inLength;
	cout << "Sweet, and the width, also in feet?" << endl;
	cin >> inWidth;
	cout << "And finally, what is the cost per yard of your selected carpet?" << endl;	
	cin >> inCostPerYard;	
    
	//calling the methods
	area();	
	supplyCost();
	salesTax();
    endTotal();
	cout << inLast << ", " << inFirst << endl;
	cout << "---------------------" << endl;
	cout << "Supply Cost:  $" << outCost << endl;
	//cout << "---------------------" << endl;
	cout << "Install Cost: $" << installCost << endl;
	//cout << "---------------------" << endl;
	cout << "Tax:          $" << totalTax << endl;
	cout << "---------------------" << endl;
	cout << "Total Cost    $" << totalCost <<endl;
	cout << "   Have a nice day!" << endl;

	return 0;
}

void area()
{
	totalArea = inLength * inWidth;
}

void supplyCost()
{
	outCost = (totalArea / 3) * inCostPerYard; 
}

void salesTax()
{
	totalTax = (outCost * taxRate) * .01;
}

void endTotal()
{
  totalCost = (outCost + totalTax + installCost); 
}
