import java.util.*;
class demo
{
    public static void main(String [] args)
    {
        int [] a = new int[5];
        Scanner sc = new Scanner(System.in);
            for(int i =0 ; i < 5 ; i++)
            {
                System.out.println("Enter the values " +i +": ");
                a[i] = sc.nextInt();
            }
        try{

            System.out.println("Enter the index: ");
            int b = sc.nextInt();
            int b_val = a[b];
            System.out.println("Enter the index: ");
            int c = sc.nextInt();
            int c_val = a[c];
                try{
                    int value = b_val/c_val;
                    System.out.println("Value: "+ value);
                }
                catch(ArithmeticException e){
                System.out.println("The Expection Caught "+ e.getMessage());

                }


        }
        catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Exception Caught "+ e.getMessage());
        }
          
    }
}
