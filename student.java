import java.util.*;
import java.util.Arrays;
class score{
	
	Scanner sc = new Scanner(System.in);
	int [] marks = new int[5];
	String [] a = {"Tamil","English","Maths","Science","Social"};
	int total;
	String [] grades = new String[5];
	int count =0 ;
	String [] fail_sub = new String[5];
	score()
	{
		total =0;
		
	}
	void getdata(){
		System.out.println("enter the marks for 100 marks "); 
		for(int i=0 ; i < 5;i++)
				{
					
					System.out.println("enter mark of "+a[i] +" subject");
					marks[i] = sc.nextInt();
					if(marks[i]<0 || marks[i] >100)
					{
						System.out.println("INVALID ENTER BETWEEN 1 -100");
						break;
					}
					total += marks[i];
				}
			}


	void grade_calac()
		{
			for(int i =0 ; i < 5;i++)
				{ 
					if(marks[i] >=90)
						grades[i] ="S";
					else if(marks[i]>=80 && marks[i]<90)
						grades[i] = "A+";
					else if(marks[i] >=70 && marks[i] <80)
						grades[i] = "A";
					else if(marks[i] >= 60 && marks[i] < 70)
						grades[i] = "B+";
 					else if(marks[i] >= 50 && marks[i] < 60)
						grades[i] = "B";
					else if(marks[i] <50){
						grades[i] = "Ra";
						
					}
				}
						
		}
	void pass()
		{
			for(int i =0 ; i < 5; i++)
				{
					if(marks[i]<50)
						{
							fail_sub[count] = a[i]; 
							count++;
						}
				}
							
		}
	void display()
		{
			 System.out.println("==============================");
				 System.out.println("Student Mark Report");
			 System.out.println("==============================");

		       	for(int i = 0 ; i< 5; i++)
				{
			 		
					System.out.printf("Subject: %-10s  |Marks: %d   |Grade: %s\n",a[i],marks[i],grades[i]);
					
				}
			 System.out.println("------------------------------");
			System.out.println("Total mark: "+ total+"/500");
			if(count==0)
			System.out.println("Student has passed all the subject");
			else{
			System.out.println("The failed subjects:\n");
			for(int i = 0 ; i< count; i++){
			System.out.println(fail_sub[i]+"\n");
			}
				}
		}
			
	}


 public class student{
	public static void main(String[] args)
		{
 
			Scanner a = new Scanner(System.in);
			score [] obj = new score[10];
			System.out.println("Enter number of student:");
			int n = a.nextInt();
			for(int i=0 ; i<n;i++)
				{
					obj[i] = new score();
					obj[i].getdata();
					obj[i].grade_calac();
					obj[i].pass();
					
					
				}
			for(int i=0 ; i<n;i++)
				{
					
					obj[i].display();
					
				}
			
			
				int max = obj[0].total;
				int [] arr =new int[10];
				for(int i =0 ; i < n ; i++)
					{
						arr[i]= i+1;
					}
				for(int i=0 ; i<n;i++)
				{
					for(int j = i+1 ;  j <n ;j++)
					{
						if(obj[i].total<obj[j].total)
						{
						 int temp =obj[j].total;
						 obj[j].total =obj[i].total; 
						 obj[i].total = temp;
						 int temp1 = arr[j];
						 arr[j] = arr[i];
						 arr[i] = temp1;
						
						}
					}
					
				}
				
				for(int i=0 ; i < n ; i++)
					{
						if(obj[i].count==0){
						 System.out.println("=========================");
						 System.out.println("Rank List");
						 System.out.println("=========================");
						 System.out.println(" Rank   |   Student  |   Total ");
						System.out.println( (i+1) + "|"+ arr[i] +"|" + obj[i].total);
					 			}
					
					}
		}
}