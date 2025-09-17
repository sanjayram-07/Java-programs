import java.util.*;
class university
{
    String clg_name;
    university()
    {

    }
    university(String clg_name)
    {
        this.clg_name = clg_name;
    }
    void show()
    {
        System.out.println("college name "+ clg_name);
    }
}




interface student
{
    void display();

}
class p_student extends university implements student
{
    String s_name;
    int id;
    p_student(String a, String b , int c)
    {
        super(a);
        s_name = b;
        id = c;
    }
    public void display()
    {
        System.out.println("college name "+ clg_name);
        System.out.println("Student name "+ s_name);
        System.out.println("Student ID "+ id);
    }
}





interface faculty
{
    void display();
}
class staff extends university implements faculty
{
    String staff_name;
    staff(String a, String b )
    {
        super(a);
        staff_name = b;
    }
    public void display()
    {
        System.out.println("college name "+ clg_name);
        System.out.println("Student name "+ staff_name);
      
    }
}


class dashboard implements student,faculty
{
    
        public void display()
    {
        
        System.out.println("Student name ");
      
    }
    public static void main(String [] args)
    {
        
    }

}
