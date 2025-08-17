import java.util.*;
class student
{
    String name;
    int roll;
    int sub;
    String [] subjects = new String[10];
    int [] int_marks = new int[10];
     int [] ext_marks = new int[10];
    int int_total,ext_total;

    Scanner sc = new Scanner(System.in);

    student()
    {
        System.out.println("Enter name of the Student");
        name = sc.nextLine();
        System.out.println("Enter roll. number ");
        roll = sc.nextInt();
    }
    

    void get_sub(){
    System.out.println("Enter number of subjects : ");
    sub = sc.nextInt();
    System.out.println("------Enter the name of the subject------");
    for(int i =0 ; i < sub ; i++)
    {
        System.out.println("Enter the name of subject : ");
        subjects[i] = sc.nextLine();
    }
    }

    void get_marks()
    {
        System.out.println("---Enter Internal marks---");
        for(int i =0 ; i < sub ; i++)
        {
            sc.nextLine();
             System.out.println("Mark of "+ subjects[i]);
             int_marks[i] = sc.nextInt();
             if(int_marks[i] < 0 || int_marks[i]>100)
             {
                 System.out.println("Invalid data");
                 return;
             }

        }


        System.out.println("---Enter External marks---");
        for(int i =0 ; i < sub ; i++)
        {
             System.out.println("Mark of "+ subjects[i]);
             ext_marks[i] = sc.nextInt();
            

            if(int_marks[i] < 0 || int_marks[i]>100)
             {
                 System.out.println("Invalid data");
                 return;
             }
        }
    }

    void total_score()
    {
        for(int i =0 ; i < sub ; i++)
            {
                int_total += int_marks[i];
                ext_total += ext_marks[i];
            }
    }
    
    void display()
    {
        System.out.println("=======Student details=======");
         System.out.println("Name of the student: "+ name);
          System.out.println("Roll of the student: "+ roll);
           System.out.println("-----Marks----");
            System.out.printf("Internal          External");
            for(int i =0 ; i< sub ; i++)
            {
            System.out.println(int_marks[i]      +    ext_marks[i]);
            }
             
    }
}
    
class full_time extends student
{
    
    int [] total = new int[10];
    String [] grade = new String[10];
       

    void gpa()
    {

        for(int i =0 ; i < sub; i++)
    total[i] = (int)(int_total *0.4 + ext_total*0.6);


          for(int i =0 ; i < sub ;i++){
        if(total[i]>=90)
        grade[i] = "S";
        else if(total[i]>=80 && total[i]<90)
      grade[i] = "A+";
      else if(total[i]>=70 && total[i]< 80)
      grade[i] = "A";
       else if(total[i]>=60 && total[i]< 70)
      grade[i] = "B+";
       else if(total[i]>=50 && total[i]< 60)
      grade[i] = "B";
      else
      grade[i] ="U";
           }

    }

    void display()
    {
        System.out.println("=======Student Grade=======");
        for(int i=0 ; i < sub ; i++){
        System.out.println("Subjects           Grade           total");
        System.out.println(subjects[i]    +     grade[i]     +   total[i]);

        }
    }
}


class part_time extends student{

    int [] total = new int[10];
    String [] grade = new String[10];
   
    void gpa()
    {

         for(int i =0 ; i <sub; i++)
    total[i] = (int)(int_total *0.5 + ext_total*0.5);


           for(int i =0 ; i < sub ;i++){
        if(total[i]>=90)
        grade[i] = "S";
        else if(total[i]>=80 && total[i]<90)
      grade[i] = "A+";
      else if(total[i]>=70 && total[i]< 80)
      grade[i] = "A";
       else if(total[i]>=60 && total[i]< 70)
      grade[i] = "B+";
       else if(total[i]>=50 && total[i]< 60)
      grade[i] = "B";
      else
      grade[i] ="U";
           }

    }

     void display()
    {
        System.out.println("=======Student Grade=======");
        for(int i=0 ; i < sub ; i++){
        System.out.println("Subjects           Grade           total");
        System.out.println( subjects[i]    +     grade[i]    +    total[i]);

        }
    }

}

class demo{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        student [] obj = new student[10];
        int choice;
        do{
        System.out.println("1.Student is Full time");
         System.out.println("2.Student is Part time");
          System.out.println("0.exit");
          System.out.println("Enter the serial number: ");
          choice = sc.nextInt();
          switch(choice)
          {
            case 1:
                full_time obj1 = new full_time();
                obj1.get_sub();
                obj1.get_marks();
                obj1.total_score();
                obj1.gpa();
                obj1.display();
                break;
            case 2:
                part_time obj2 = new part_time();
                obj2.get_sub();
                obj2.get_marks();
                obj2.total_score();
                obj2.gpa();
                obj2.display();
                break;
            case 0:
                break;
            default:
                break;


          }
        }while(choice!=0);
        
    }

}
