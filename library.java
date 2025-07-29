import java.util.*;
public class library{
	public static void main(String [] args)
		{
		  
			book obj1 = new book("NO Days Left","Willam",150,1992);
			book obj2 = new book("Jaden Talks","Sora",500,2009);
			obj1.days();
			obj1.fine_calc();
			obj2.days();
			obj2.fine_calc();
			obj1.display();
			obj2.display();
		}
}

class book{
	String book_title = new String();
	String author = new String();
	int price;
	int year;
	int daysLate;
	int finePerDay;
	int total_fine =0;
	
	book(String a , String b , int c , int d)
	{
		book_title = a;
		author = b;
		price = c;
		year =d;
		finePerDay = 2;
		
	}

	void days()
	{
		System.out.println("Enter the no days late for the book "+ "'"+ book_title +"'");
		Scanner sc = new Scanner(System.in);
		daysLate = sc.nextInt();
		
	}
	
	void fine_calc()
	{
		 total_fine = daysLate * finePerDay;
		
	}
	void display()
	{
		System.out.println(" Book Title :"+ book_title);
		System.out.println(" Author :"+ author);
		System.out.println(" price of book :"+ "$"+price);
		System.out.println(" year of publication: "+ year);
		System.out.println(" No. of days Late :"+ daysLate);
		System.out.println("Fine amount:"+total_fine );
		System.out.println(" -----------------------------------------------");
		
	}
}