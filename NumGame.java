import java.util.*;

class NumGame
{
	int Ans,i,entered=0;
	static Scanner in;
	NumGame()
	{
		Random r=new Random();
		Ans=r.nextInt(100);
		in=new Scanner(System.in);
	}
	public void start()
	{
		for(i=10;i>0;i--)
		{
			try{
			System.out.println();
			System.out.println("Guess The Number Between 1 to 100 : ");
				entered=Integer.parseInt(in.next());
				if(entered>100)throw new NumberFormatException();
			}
			catch(NumberFormatException e)
			{
				System.out.println("Wrong Input");
				i++;
				continue;
			}
			if(entered==Ans)
			{
				System.out.println("\t\tHURRAY!");
				System.out.println("\t\tYou Win...Gussed in "+(10-i+1)+" Chances");
				System.out.println("\t\tChance of Wining is "+10*(i-1)+"%\n\n`");
				break;
			}
			else if(entered>Ans)
			{
				System.out.println("Wrong...");
				System.out.println("You Entered Greater Value");
				System.out.println("Chance Left: "+(i-1));
			}
			else if(entered<Ans&&entered>0 )
			{
				System.out.println("Wrong...");
				System.out.println("You Entered Smaller Value");
				System.out.println("Chance Left: "+(i-1));
			}

		}
		if(i==0){
		System.out.println();
		System.out.println("\t\t\tYou Lose The Game...\n\n");
		}
	}
	public static void main(String args[])
	{
		int ch=0;
		do
		{
			NumGame n=new NumGame();
			System.out.println("\t\t\tMain Menu");
			System.out.println("\t1) Start");
			System.out.println("\t2) Exit");
			try{ch=in.nextInt();
			switch(ch){
				case 1: n.start();
				break;
				case 2: System.exit(0);;
				break;
				default: System.out.println("Enter valid Input: ");
				break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
		}while(ch!=2);
	}

}
