
public class Game 
{
	public void fizzBuzz(int gameSize)
	{
		for (int i=1; i<=gameSize; i++)
		{
			if (i>1)
				System.out.print(", ");
			if ((i%3 == 0) && (i%5 == 0))
				System.out.print("fizzbuzz");
			else if (i%3 == 0)
				System.out.print("fizz");
			else if (i%5 == 0)
				System.out.print("buzz");
			else
				System.out.print(i);
		}
	}
	public static void main(String[] args) 
	{
		Game newGame = new Game();
		newGame.fizzBuzz(0); //Enter length of game here
	}

}
