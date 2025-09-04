import java.util.*;
interface creation{
    void show();
}
class token{
    Scanner sc = new Scanner(System.in);
    int [][] details = new int[10][10];
    int n;
    void get(){
    System.out.println("Enter How many employees : ");
     n = sc.nextInt();
    if(n<0)
    {
        System.out.println("invalid number");
        return;
    }
    for(int i=0 ; i < n ; i++)
    {
       
            System.out.println("enter the id of the employee");
            details[i][0] = sc.nextInt();
            if(String.valueOf(details[i][0]).length()!=5)
            {
                System.out.println("length should be 5 ");
                return;
            }
            System.out.println("enter the overtime of the employee");
            details[i][1] = sc.nextInt();
            if(details[i][1]<0 || details[i][1]>8)
            {
                System.out.println("OT should be less than 8 and greater than zero");
                return;
            }

    }
}
    class inner{
        int [] code = new int[10];
        void generate()
        {
            for(int i =0 ; i < n ; i++)
            {
                code[i] = details[i][1]*1000 + details[i][0]%1000;
            }

        }
        void display()
        {
            for(int i =0; i < n ; i++)
            {
                for(int j =i+1; j < n ; j++)
                {
                    if(code[j]>code[i])
                    {
                        int temp = code[i];
                        code[i] = code[j];
                        code[j] = temp;
                    }
                }
            }
            for(int i =0 ; i < n; i++)
            {
                System.out.println("The token  : "+ code[i]);
            }
        }
    }
}
class token_generator{

    public static void main(String [] args){

    token obj = new token();
    obj.get();
    token.inner obj1 = obj.new inner();
    obj1.generate();
    creation obj3 = new creation(){
       public void show()
        { 
             System.out.println("-------The Tokens-----");
             obj1.display();
        }
    };
    obj3.show();
   
    }
}
