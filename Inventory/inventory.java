import java.util.*;
class Admin{
    static String [][] pro_price = new String[15][15];
    static int pro_count =0;
     Scanner sc  = new Scanner(System.in);
    void create_cart()
    {
        
        if(pro_count ==0 || pro_count<15){
        
          System.out.println("How many product want to Add in the cart: ");
          int n = sc.nextInt();
          sc.nextLine();
        for(int i =0; i <n ; i++)
        {
          System.out.println("Enter name of the "+"Product "+ (i+1)+" : ");
          pro_price[i][0]=  sc.nextLine();
          System.out.println("Enter price of the "+ pro_price[i][0]); 
          pro_price[i][1] = Integer.toString( sc.nextInt());
          sc.nextLine();
        
        }
        pro_count += n;
        }
        else
        {
            System.out.println("The items cart is full");
        }

    }


    void show()
    {
        if(pro_count ==0)
        System.out.println("The items list is Empty");
        else{
        System.out.println("-------LIST------------");
        for(int i =0 ; i <pro_count;i++){
         System.out.println((i+1) +"."+ pro_price[i][0]+"-  "+" $ "+pro_price[i][1]);
        }
        System.out.println("---------------------------");

    }
}
}

class Each_customer_cart extends Admin{
    Scanner sc  = new Scanner(System.in);
    
    //int [][] trans = new int[15][];
    String [][] cus = new String[15][15];
    int cus_count =0;
    int total_cus =0;
    int cusid ;
    void customer_cart()
    {
        if(pro_count ==0)
        System.out.println("The items cart is Empty");
        else{
        for(int i =0 ; i <pro_count;i++){
         System.out.println((i+1) +"."+ pro_price[i][0]+"-  "+" $ "+pro_price[i][1]);
        }
        System.out.println("Enter the serial number of the product to add: ");
        int num = sc.nextInt();
        if(num <=0 || num > pro_count)
        System.out.println("Invalid option");
        else{
        cus[cus_count][0]  = pro_price[num-1][0];
        cus[cus_count][1] = pro_price[num-1][1];
        cus_count++;
        System.out.println("Item added");
        }

        }
    }

    void total_cost(){
        total_cus =0;
        for(int i =0 ; i < cus_count;i++)
        {
             int price = Integer.parseInt(cus[i][1].trim()); 
            total_cus += price;
        }
        
    }

    void display_cart()
    {
        
        System.out.println("-----------------");
        System.out.println("CART");
        System.out.println("-----------------");
        if(cus_count == 0)
        System.out.println("Your cart is Empty");
        else{
        for(int i=0 ; i < cus_count; i++)
        {
        System.out.println((i+1)+": "+cus[i][0]+" : "+ cus[i][1]);
        
        }
    }
    }


}
class All_customer_management {
         Each_customer_cart [] object = new Each_customer_cart[10];
         Scanner sc  = new Scanner(System.in);
         int count =0;
         boolean a = true;
         int total_trasaction_amt =0;
         void customers()
         {
            
             if(count ==0 || count<10)
             {
                object[count] = new Each_customer_cart();
                System.out.println("Enter the id of the customer: ");
                
                object[count].cusid = sc.nextInt();
                count++;
             }
             else{
                System.out.println("The customer limit is reached");
                a = false;
             }
         
         }
         void customer_id()
         {
            if(count ==0)
            System.out.println("NO customers ");
            else{
                for(int i =0 ; i < count ; i++)
            System.out.println((i+1)+": "+ object[i].cusid );
            }
         }

         void total_transac()
         {
            for(int i =0 ; i < count ; i++){
                total_trasaction_amt +=  object[i].total_cus; 
            }
            System.out.println("The Total transaction amount is : "+"$ "+ total_trasaction_amt);
         }

         void display()
         {
            if(count !=0){
             System.out.println("------------------------");
             for(int i=0 ; i < count ; i++)
                {
                   
                    System.out.println("The id of the Customer: "+object[i].cusid);
                    System.out.println("-------CART--------");
                    for(int j=0 ; j < object[i].cus_count; j++)
                    {
                    System.out.println((j+1)+": "+object[i].cus[j][0]+" : "+ object[i].cus[j][1]);
                    }
                    System.out.println("---------------------------");
                }
            }
            else{
                System.out.println("No customers");
            }
            
         }
}
public class demo{
    public static void main(String [] args)
    {
        Admin Adm = new Admin();
        String password = "2006";   
        All_customer_management obj1 = new All_customer_management();
        int choice;
        Scanner sc  = new Scanner(System.in);
        do{
            System.out.println("=====================");
            System.out.println("1.Customer");
            System.out.println("2.Admin");
            System.out.println("0.Exit");
            System.out.println("=====================");
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();
            System.out.println("**********************");
            switch(choice){
            case 1:
                obj1.customers();
                if(obj1.a){
                int choice2;
                do{
                    System.out.println("==================");
                    System.out.println("1.Add items");
                    System.out.println("2.Total cost");
                    System.out.println("3.My cart");
                    System.out.println("0.Exit");
                    System.out.println("===================");
                    choice2 = sc.nextInt();
                    System.out.println("*******************");
                    switch(choice2)
                    {
                        case 1:
                            obj1.object[obj1.count - 1].customer_cart();
                            break;
                        case 2:
                             obj1.object[obj1.count - 1].total_cost();
                            System.out.println("Total cost: $" +  obj1.object[obj1.count - 1].total_cus);
                            
                            break;
                        case 3:
                                 obj1.object[obj1.count -1].display_cart();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                }while(choice2 != 0);
            }
                break;
            case 2:
                int choice1;
                sc.nextLine();
                System.out.println("Enter the password:");
                String pass = sc.nextLine();
                if(pass.equals(password))
                {
                do{
                    System.out.println("======================");
                    System.out.println("1.Add items");
                    System.out.println("2.Id's of customer");
                    System.out.println("3.Total transactions Amount");
                    System.out.println("4.Transaction of All customers");
                    System.out.println("5.Show the Items");
                    System.out.println("0.Back");
                    System.out.println("======================");
                    choice1 = sc.nextInt();
                    System.out.println("********************");
                    switch(choice1)
                    {
                        case 1:
                             Adm.create_cart();
                            break;
                        case 2:
                            obj1.customer_id();
                            break;
                        case 3:
                            obj1.total_transac();
                            break;
                        case 4:
                           obj1.display();
                            break;
                        case 5:
                         Adm.show();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                }while(choice1 != 0);
            }
            else{
                  System.out.println("Wrong passWord");
            }
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice");
                break;

            }
        }while(choice!=0);

        sc.close();
    }
}
