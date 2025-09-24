import java.io.*;
class demo
{
    public static void main(String [] args)
    {
        try{
            FileReader a = new FileReader("rrt.txt");
            
        }
        catch(FileNotFoundException e){
             System.out.println("Exception : " + e.getMessage());

        }
    }
}
