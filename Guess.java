import java.util.*;
class random{
	int x;
	int a;
	Scanner sc = new Scanner(System.in);
	void getdata()
		{
			x = (int)(Math.random()*10+1);
			while(true){
			System.out.println("Enter the guessing number between 1 to 10: ");
			a = sc.nextInt();
			System.out.println("Want to exit enter 0:\n");
			if(a == 0)
				break;
			else if(x==a){
			System.out.println("Yahhh got the number");
				break;
			}
			else if(x<a)
			System.out.println("The number is less than the gussed number\n\n");
			else
			System.out.println("The number is greater than the gussed number\n\n");
			
}		
		}
}
class Guess
{
	public static void main(String [] args)
		{

			random r = new random();
			r.getdata();
			
		}
}