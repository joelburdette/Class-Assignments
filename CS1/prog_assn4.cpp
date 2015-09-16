#include <iostream>

using namespace std;
//arrays to store x values, totals, coefficients 


double power(double, int);
int main() {
int highest_exp =0, i=0;
float xs[25];
    float coef[20];
double result=0, constant=0;
    int a=0, b=0, c=0, d=0, e=0;
double x=0;
int exp =0;
float subtotal=0;
cout<<"Enter the highest exponent of your function"<<endl;
        cin>>highest_exp;

        if(highest_exp < 1)
        {
                cout << "This exponent cannot be less than 1" << endl;
                cout << "Please enter a positive integer now"<<endl;
                cin>>highest_exp;
        }

result=0.0;
for(i=highest_exp; 1<=i; i--) {
cout<<"Enter the coefficient of the x^"<<i<<" term"<<endl;
cin>>coef[i];
//if(coef!=0)
//result+=coef*power(x,i);
}

cout<<"Enter the constant number for your function"<<endl;
cin>>constant;
//result+=constant;

do {cout<<"Enter the value of x you would like calculated"<<endl;
cin>>xs[a];
a++;
cout<<"Do you have another value for x you want calculated? Enter 1 for yes 0 for no" << endl;
cin>>b;
} while(b==1);
cout<<"f(x) = ";//<<result<<endl;
for (i=0; i<highest_exp; i++)
{
 c = highest_exp - i;
      if(coef[c] == 0)
      {
        d++;
      }  
      if(coef[c] !=0) 
 {
   if(i>d)
{
  cout<<"+";
}
   cout << coef[c] << "x^" << c;
 }
}
if(d == highest_exp && constant == 0)
{
cout <<"0";
}
if(constant > 0)
{
 if( d!=highest_exp)
 {
   cout <<"+";
 }
 cout<< constant;
}
cout<< endl <<endl;
for (i = 0; i < a; i++)
{
//}
for(e = 0; e < highest_exp; e++)
{
exp = highest_exp - e;
x = xs[i];
subtotal = power(x,exp);
//cout<< coef[exp]<<endl;
subtotal = subtotal * coef[exp];
result = subtotal + result;
}
result = result + constant;
cout<<"f(" <<xs[i]<<") = "<<result<<endl;
//cout << result;
result = 0;
}
return 0;
}

double power(double x, int exp) {
double result;
int i;

result=1.0;
for(i=0; i<exp; i++) {
result *= x;
}

return result;
}
