import java.util.*;
class work{
	int bal;
	int dep;
	int withdraw;
	Scanner sc = new Scanner(System.in);
	work()
	{
		bal =0;
	}
	void balance()
	{
		System.out.println("Enter the Initial balance:");
		if(bal<0)
		System.out.println("Invalid");
		else
		bal = sc.nextInt();
		
	}
	void deposit()
	{
		System.out.println("Enter the amount need to be deposited: ");
		dep = sc.nextInt();
		if(dep <0)
		System.out.println("The amount is INVALID");
		else
		bal +=dep;
	}
	void withdraw_amount()
	{
		System.out.println("Enter the amount need to be withdrawn: ");
		withdraw = sc.nextInt();
		if(withdraw<0)
		{
			System.out.println("Invalid amount");
		}
		else if(withdraw>bal)
		{
			System.out.println("Amount exceed the balance amount");
			
		}
		else
		{
			bal-=withdraw;
			System.out.println("The Balance amount is: "+ "$ " + bal);
		}
	}
	void check_bal()
	{
		System.out.println("The Balance : "+bal);
	}
}
class atm{
	public static void main(String [] args)
		{	
			Scanner sc = new Scanner(System.in);
			work obj = new work();
			int x;
			obj.balance();
			do{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("0.Exit");
			System.out.println("Enter your choice:");
			x= sc.nextInt();
			switch(x)
				{
					case 1:
						obj.deposit();
						break;
					case 2:
						obj.withdraw_amount();
						break;
					case 3:
						obj.check_bal();
						break;
					case 0:
						break;
					default:
						break;
					
				}
			}while(x!=0);
			
		}
}
