import java.util.Scanner; 

public class NumberGuessingGame
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				

				System.out.println("Hello, welcome to the number guessing game. What is your name?");
				String name = userInput.next(); 
		
				System.out.println("Hello " + name + " it's time to play the number guessing game, please guess a number between 1 and 10.");
				int randomNumber = (int)(Math.random()*10+1); 
				boolean keepGuessing = true; 
				int counter = 0; 
				
				while(keepGuessing)
					{
						counter++; 
						int guess = userInput.nextInt(); 
				
						if (guess > randomNumber) 
						
							{ 
								System.out.println("That number is too high, guess again.");
							}
					
						else if (guess < randomNumber)
							{ 
								System.out.println("That number is too low, guess again.");
							}
						else
							{ 
								System.out.println(("You guessed the correct number"));
								keepGuessing = false; 
								System.out.println("It took you " + counter + " number of attempts");
								
								//Test
							}
						
		
					}
				
					
					
					
				
				

					
			
	
			}

	}
