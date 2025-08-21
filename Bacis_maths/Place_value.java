import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        int placevalue =1 ,  res=1;
        boolean a = false;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        int i =0 ;
        String [] arr = {"ones", "tens","hundreds","thousand"};
        while(num!=0)
        {
            int digit = num%10;
            if(digit == target )
            {
                placevalue = res*target;
                a =true;
                break;
            }
             res *=10;
            num/=10;
            i++;
        }
        if(a)
        {
             System.out.println("places "+ arr[i]);
            System.out.println("The place value "+placevalue);
            System.out.println("The face value " + target);
        }   
        else{
            System.out.println("the given number is not in the digits of the number");
        }
    }
}
