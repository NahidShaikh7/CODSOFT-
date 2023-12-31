import java.util.*;
class GuessNumber
{
		public static void main(String []args)
		{
			int Guess,Number;
			int Maximum=100,attempts=0;
			int roundsWon = 0;
			Scanner s=new Scanner(System.in);
			
			boolean correct = false; 
			
			
			while(true)
			{
				Number=new Random().nextInt(Maximum)+1;
				boolean guessCorrect = false;
			
				while (!correct && attempts <= 10)
				{ 
				System.out.println("Guess a number between 1 and 100:"); 
  
            
				Guess = s.nextInt(); 
				attempts++;
  
            
				if (Guess > Number) 
				{ 
					System.out.println("Too high, try again"); 
				} 
  
            
				else if (Guess < Number)
				{ 
					System.out.println("Too low, try again"); 
				} 
  
            
				else 
				{ 
  					System.out.println("Yes, you guessed the number."); 
					guessCorrect = true;
					break;
  
                //correct = true; 
				} 
				}
				if (guessCorrect) 
				{
					roundsWon++;
				}
				
				if (!correct) 
				{
                System.out.println("You have used all 10 attempts! The number was: " + Number);
				}
				
				
				String PlayAgain;
				System.out.println("Do You Want To Play Again?");
		
				while(true)
				{
			
					System.out.println("Type 'Yes' Or 'No'");
					PlayAgain=s.nextLine();
		
					if(PlayAgain.equals("Yes")|| PlayAgain.equals("yes") || PlayAgain.equals("No") || PlayAgain.equals("no"))
					{
						System.out.println("**********************************************************************************");
						break;
					}
					
			
				}
			if(PlayAgain.equals("no") || PlayAgain.equals("No")) 
			{
					break;
			}
				
			}
			System.out.println(" You Won Rounds : " + roundsWon);
		}
}
  
        
    
			
		
