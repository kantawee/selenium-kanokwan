package webDriverPackage;

public class NoteCondition03122017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Condition Statement: it checks condition if it's true or false
		// Example1: Passed condition
		int score =80;
		
		if (score>70)
		{
			System.out.println("You are passed the exam");
		}
		else 
		{
			System.out.println("You are failded the exam");
		}
		
		// Failed condition
		
		int score1 =60;
		
		if (score1>70)
		{
			System.out.println("You are passed the exam");
		}
		else 
		{
			System.out.println("You are failed the exam");
		}
		
		// Example 2: Condition what grade do you have
		// Your score is..?
		int score2=90;
		// Condition with A
		if (score2 >= 90)
		{
			System.out.println("You receive A");
		}
		//condition with B
		else if (score2>=80)
		{
			System.out.println("You receive B");
		}
		// Condition with C
		else if (score2>=70)
		{
			System.out.println("You receive C");
		}
		// Condition with D
		else if (score2<=69)
		{
			System.out.println("You receive D");
		}
		// condition statement
		else 
		{
			System.out.println("You are failed the exam");
		}
		
		// While Condition
		
		int i=80;
		while (i>=90)
		{
			System.out.println("You receive A");
		}
		
		
		
	}

}
