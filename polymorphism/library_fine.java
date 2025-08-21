import java.util.*;
 class general{
    int day_count =0;
    String name;
    general(String name)
    {
        this.name = name;
    }
    
     void fine_calc(int days)
     {
        System.out.println("The number of days "+days);
        return;
     }
     void fine_calc(int month , int days)
     {
        day_count = month *30 +days;
       
     }
   
     
}
class ug extends general{
    ug(String a)
    {
        super(a);
    }
    int fine =0;
    void fine_calc(int days)
    {
        if(days >15 && days < 25)
        {
            fine = (days-15)*5;
        }
        else if(days <0)
        {
            System.out.println("Invalid days");
        }
        else if(days<15)
        {
            System.out.println("No fine");
        }
        else if(days >25) {
            int rem = days -25;
            fine = 10*5 + rem*10;
        }
        
        
    }

    void fine_calc(int month , int days)
    {
        if(month <0 || days <0 )
        {
            System.out.println("Invalid data");
            return;
        }
        super.fine_calc(month,days);
        if(day_count < 25 && day_count >15)
        {
            fine = (day_count-15)*5;
        }
         else if(day_count<15)
        {
            System.out.println("No fine");
        }
        else if(day_count >25) {
            int rem = day_count -25;
            fine = 10*5 + rem*10;
        }
    }
    void display()
    {
        System.out.println(name + ": is UG student ");
        System.out.println("The fine amount : "+fine);

    }
}


class pg extends general{
    pg(String a)
    {
        super(a);
    }
    int fine =0;
    void fine_calc(int days)
    {
        if(days >30 && days < 40)
        {
            fine = (days-30)*5;
        }
        else if(days <0)
        {
            System.out.println("Invalid days");
        }
        else if(days<30)
        {
            System.out.println("No fine");
        }
        else if(days > 40) {
            int rem = days -40;
            fine = 10*5 + rem*10;
        }
        
        
    }

    void fine_calc(int month , int days)
    {
        if(month <0 || days <0 )
        {
            System.out.println("Invalid data");
            return;
        }
        super.fine_calc(month,days);
        if(day_count < 40 && day_count >30)
        {
            fine = (day_count-30)*5;
        }
         else if(day_count<30)
        {
            System.out.println("No fine");
        }
        else if(day_count >40){
            int rem = day_count -40;
            fine = 10*5 + rem*10;
        }
    }
    void display()
    {
        System.out.println(name + ":"+"is PG student ");
        System.out.println("The fine amount : "+fine);
        
    }
}


class staff extends general{
    staff(String a)
    {
        super(a);
    }
    int fine =0;
    void fine_calc(int days)
    {
        if(days >90 )
        {
            fine = (days-90)*5;
        }
        else if(days <0)
        {
            System.out.println("Invalid days");
        }
        else if(days<90)
        {
            System.out.println("No fine");
        }
        
        
    }

    void fine_calc(int month , int days)
    {
        if(month <0 || days <0 )
        {
            System.out.println("Invalid data");
            return;
        }
         super.fine_calc(month,days);
        if(day_count >90)
        {
            fine = (day_count-90)*5;
        }
         else if(day_count<90)
        {
            System.out.println("No fine");
        }
        
    }
    void display()
    {
        System.out.println(name + ": "+" Staff ");
        System.out.println("The fine amount : "+fine);
        
    }
}

class Fine{

        public static void main(String [] args)
        {
            Scanner sc = new Scanner(System.in);
            int choice;
            System.out.println("1.UG student");
            System.out.println("2.PG student");
            System.out.println("3.Staff");
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    String a;
                    sc.nextLine();
                    System.out.println("Enter the name: ");
                    a = sc.nextLine();
                    ug obj = new ug(a);
                    int choice2;
                    System.out.println("1.days");
                    System.out.println("2.Months days");
                    System.out.println("Enter your choice");
                    choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                                System.out.println("Enter number of days :");
                                int day = sc.nextInt();
                                obj.fine_calc(day);
                                obj.display();
                                break;
                        case 2:
                                System.out.println("Enter number of months :");
                                int mon = sc.nextInt();
                                System.out.println("Enter number of days :");
                                int x = sc.nextInt();
                                obj.fine_calc(mon,x);
                                obj.display();
                                break;
                        default:
                         break;
                    }
                    break;
                case 2:
                    String b;
                     sc.nextLine();
                    System.out.println("Enter the name: ");
                    b = sc.nextLine();
                    pg obj1 = new pg(b);
                    int choice3;
                    System.out.println("1.days");
                    System.out.println("2.Months days");
                    System.out.println("Enter your choice");
                    choice3 = sc.nextInt();
                    switch(choice3){
                        case 1:
                                System.out.println("Enter number of days :");
                                int day = sc.nextInt();
                                obj1.fine_calc(day);
                                obj1.display();
                                break;
                        case 2:
                                System.out.println("Enter number of months :");
                                int mon = sc.nextInt();
                                System.out.println("Enter number of days :");
                                int z = sc.nextInt();
                                obj1.fine_calc(mon,z);
                                obj1.display();
                                break;
                        default:
                                break;
                    }
                    break;
                case 3:
                    String c;
                     sc.nextLine();
                    System.out.println("Enter the name : ");
                    c= sc.nextLine();
                    staff obj2 = new staff(c);
                    int choice4;
                    System.out.println("1.days");
                    System.out.println("2.Months days");
                    System.out.println("Enter your choice");
                    choice4 = sc.nextInt();
                    switch(choice4){
                        case 1:
                                System.out.println("Enter number of days :");
                                int day = sc.nextInt();
                                obj2.fine_calc(day);
                                obj2.display();
                                break;
                        case 2:
                                System.out.println("Enter number of months :");
                                int mon = sc.nextInt();
                                System.out.println("Enter number of days :");
                                int y = sc.nextInt();
                                obj2.fine_calc(mon,y);
                                obj2.display();
                                break;
                        default :
                        break;
                    }
                    break;

            }
        }

}
