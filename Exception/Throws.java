import java.util.*;
class CreditLimitException extends Exception
{
    int credit;
    CreditLimitException()
    {
       super("Credit Limit exception");
       credit = 10000;
    
        
   }
   
}
class demo
{
    static void check(int credit) throws CreditLimitException
    {
        if(credit > 10000)
        {
            throw new CreditLimitException();

        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int balance = 15000;
            System.out.println("Intial Balance : 15000");
             System.out.println("Enter the withdraw amt :" );
             int a = sc.nextInt();
             check(a);
             System.out.println("Balance :" + (balance-a));
        }
        catch(CreditLimitException e)
        {
             System.out.println("exception : "+e.getMessage());
        }
        
    }
}
