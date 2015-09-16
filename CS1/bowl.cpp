#include <iostream>

using namespace std;

int main (void)
{
string inName1, inName2, bowler; //Variables
int inScore, playerScore;
int roll1, roll2, roll3;
int score1 = 0;
int score2 = 0;

cout << "Please enter Player One's name" << endl; //prompts
cin >> inName1;
cout << "Please enter Player Two's name" << endl;
cin >> inName2;
cout << "Please enter their tied score entering the tenth frame" << endl;
cin >> inScore;

for (int i=1; i<=2; i++)
 { 
	 
		roll1 = 0; 
		roll2 = 0; 
		roll3 = 0;		
		playerScore = 0;  
	    bowler = inName1;
		//score = score1; 
	 if (i == 2) //switching player name
	 {
	    bowler = inName2;
	    //score = score2;
	 }
	cout << "How many pins did " << bowler << " knock down in the first round?" << endl; //first round
	cin >> roll1;
    playerScore = playerScore + roll1;
  	 		//cout << playerScore << endl;

	cout << "How many pins did " << bowler << " knock down in the second round?" << endl; //second round
	cin >> roll2;
    playerScore = playerScore + roll2;
	 		//cout << playerScore << endl;

	if ( roll1 == 10 || roll1 + roll2 == 10) //check for third round
	{
	cout << "How many pins did " << bowler << " knock down in the third round?" << endl; //third round
	cin >> roll3;
    playerScore = playerScore + roll3;
        //if (roll1 == 10) //strike check
		//{
		   //playerScore = playerScore + roll2 + roll3;  
		//}
	 		//cout << playerScore << endl;
	}
    
	if(i == 1)  //which score to add to
	{
		score1 = playerScore + inScore;
	} else 
	 {
		score2 = playerScore + inScore;
	 }
	//cout << score1 << endl;
	//cout << score2 << endl;
    
  }   //end of for loop
    if (score1 > score2) //comparing scores
    {
		cout << "The winner is " << inName1 << " with a score of: " << score1 << endl;
	    cout << inName2 << " got second place with a score of: " << score2 << endl;
	} else if ( score2 > score1)
	{
		cout << "The winner is " << inName2 << " with a score of: " << score2 << endl;
		cout << inName1 << " got second place with a score of: " << score1 << endl;
	} else
	{
	    cout << "It's a tie again!" << endl;
	}
}
