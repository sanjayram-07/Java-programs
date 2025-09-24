import java.util.*;
class arith
{
    void ex(){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println("value : "+ c);
        }
        catch(ArithmeticException e){
            System.out.println("The Expection Caught "+ e.getMessage());

        }
    }
}
class arthithrow
{
    void exe(){
   Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
           
            if(b==0)
            throw new ArithmeticException("Can't Divide by Zero");
            int c = a/b;
            System.out.println("value : "+ c);
        }
        catch(ArithmeticException e){
            System.out.println("The Expection Caught "+ e.getMessage());

        }
    }
}
class two_catch_child
{
    void exee()
    {
     Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;  
            System.out.println("value : "+ c);
        }
        catch(ArithmeticException e){
            System.out.println("The Expection Caught "+ e.getMessage());

        }
        catch(Exception e)
        {
            System.out.println("Exception is "+ e.getMessage());
        }
    }
}
class two_catch_parent
{
    void exec(){
     Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;  
            System.out.println("value : "+ c);
        }
       /* catch(Exception e)
        {
            System.out.println("Exception is "+ e.getMessage());
        }        Already Exception caught    */ 
        catch(ArithmeticException e){
            System.out.println("The Expection Caught "+ e.getMessage());

        }
    }
        
}
class demo
{
    public static void main(String [] args)
    {
       System.out.println(" 1..The ArithmeticException "); 
       arith obj1 = new arith(); 
       obj1.ex();
        System.out.println(" 2..The Throw "); 
        arthithrow obj2 = new arthithrow(); 
       obj2.exe();
        System.out.println(" 3..The Two catch first child"); 
      two_catch_child obj3 = new two_catch_child(); 
       obj3.exee();
        System.out.println(" 4..The Two catch first parent"); 
       two_catch_parent obj4 = new two_catch_parent(); 
       obj4.exec();
        
    }
}
