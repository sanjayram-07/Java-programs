import java.util.*;
interface account{
    void deposit();
    void withdraw();
    static void bank_policy()
    {
        System.out.println("Minimum balance is 1000 for Saving account");
        System.out.println("OverDraft amount facility upto 50000");
    }
}

class saving implements account
{
    int balance;
    Scanner sc = new Scanner(System.in);
    public void deposit()
    {
        int depos ;
        System.out.println("Enter the deposit amount : ");
        depos = sc.nextInt();
         if(depos<0)
        {
            System.out.println("Invalid Amount");
            return;
        }
        balance += depos;
        System.out.println("Balance amount : "+ balance);
        
    }
    public void withdraw()
    {
        if(balance <1000)
        {
            System.out.println("The balance amount is less than 1000 cannot withdraw ");
            return;
        }
        int withd;
        System.out.println("Enter the withdraw amount : ");
        withd = sc.nextInt();
        if(withd > 15000)
        {
            System.out.println("Max amount of withdraw is 15000");
            return;
        }
         if(withd < balance){
        balance -= withd;
        System.out.println("Balance amount : "+ balance);
         }
         else
         {
            System.out.println("Withdraw amount is greater than the balance "); 
         }
        
    }
}

class current implements account
{
    int balance;
    Scanner sc = new Scanner(System.in);
    public void deposit()
    {
        int depos ;
        System.out.println("Enter the deposit amount : ");
        depos = sc.nextInt();
        if(depos<0)
        {
            System.out.println("Invalid Amount");
            return;
        }
        balance += depos;
        System.out.println("Balance amount : "+ balance);
    }
    public void withdraw()
    {
        if(balance <1000)
        {
            System.out.println("The balance amount is less than 1000 cannot withdraw ");
            return;
        }
        int withd;
        System.out.println("Enter the withdraw amount : ");
        withd = sc.nextInt();
        if(withd > 50000)
        {
            System.out.println("Max amount of withdraw is 50000");
            return;
        }
         if(withd < balance){
        balance -= withd;
        System.out.println("Balance amount : "+ balance);
         }
         else
         {
            System.out.println("Withdraw amount is greater than the balance "); 
         }
    }
}

class bank
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.saving");
            System.out.println("2.current");
            System.out.println("3.Bank policy");
            System.out.println("0.exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    saving obj = new saving();
                    int choice1;
                    do{ 
                            
                            System.out.println("1.deposit");
                            System.out.println("2.withdraw");
                            System.out.println("0.exit");
                            System.out.println("Enter your choice: ");
                            choice1 = sc.nextInt();
                   
                            switch(choice1)
                            {
                                case 1:
                                    obj.deposit();
                                    break;
                                case 2:
                                    obj.withdraw();
                                    break;
                                case 0:
                                    break;
                                
                            }
                      }while(choice1!= 0);
                      break;

                case 2:
                    current obj1 = new current();
                    int choice2;
                    do{ 
                           
                            System.out.println("1.deposit");
                            System.out.println("2.withdraw");
                            System.out.println("0.exit");
                            System.out.println("Enter your choice: ");
                            choice2 = sc.nextInt();
                   
                            switch(choice2)
                            {
                                case 1:
                                    obj1.deposit();
                                    break;
                                case 2:
                                    obj1.withdraw();
                                    break;
                                case 0:
                                    break;
                                
                            }
                      }while(choice2 !=0);
                      break;
                
                case 3:
                    account.bank_policy();
                    break;
            }

        }while(choice !=0);
        

    }
}
