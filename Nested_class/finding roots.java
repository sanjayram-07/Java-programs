import java.util.*;
class root{
    Scanner sc = new Scanner(System.in);
    static int a, b,c;
    static double r1,r2;
    void get(){
        System.out.println("Enter value of a : ");
        a = sc.nextInt();
        System.out.println("Enter value of b : ");
        b = sc.nextInt();
        System.out.println("Enter value of c : ");
        c = sc.nextInt();
            if(a == 0)
            {
                System.out.println("Not a Quadratic Equation");
                return;
            }
    }
    static class calc{
        double d=0;
        double x , y ;
        void real(){
             d = b*b - 4*a*c ;
            if(d<0)
            {
               x = -b/(2*a);
               y =  Math.sqrt(-d)/(2*a);
            }
            else
            {
                 r1 = (-b + Math.sqrt(d))/(2.0*a);
                 r2 = (-b - Math.sqrt(d))/(2.0*a);
            }

        }
    }
     class inner{
        
        void display()
        {
            root.calc obj = new root.calc();
            obj.real();
            if(obj.d<0){
              System.out.println("Root1 : "+obj.x + "+ i"+obj.y);
               System.out.println("Root2 : "+obj.x + "- i"+obj.y);
            }
            else
            {
                System.out.println("Root1 : "+r1);
               System.out.println("Root2 : "+r2);
            }
        }

    }
}

class demo{
    public static void main(String [] args)
    {
        root obj1 = new root();
        obj1.get();
        root.inner obj2 = obj1.new inner();
        obj2.display();
       
    }
}
