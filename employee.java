import java.util.*;

class Wage {
    Scanner sc = new Scanner(System.in);
    static int hourly_wage = 400;
    float weekly_wage;
    int hours;

    void get_data() {
        System.out.print("Enter the number of hours working: ");
        hours = sc.nextInt();
        if(hours<0)
        System.out.println("Invalid");
    }

    int calc() {
        if (hours < 0) {
            return -1;
        } else if (hours <= 40) {
            weekly_wage = hourly_wage * hours;
        } else {
            weekly_wage = 40 * hourly_wage + 1.5f * (hours - 40) * hourly_wage;
        }
        return (int) weekly_wage;
    }

    
    static int totalWages(Wage[] arr, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if(arr[i].calc()==-1)
            continue;
            else
            sum += arr[i].calc();
        }
        return sum;
    }
}

class employee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Wage[] obj = new Wage[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Wage of Each employees");
            System.out.println("2. Add employee");
            System.out.println("3. Total employees");
            System.out.println("4. Total wages ");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("No employees added yet.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            if(obj[i].calc()==-1)
                            continue;
                            else
                            System.out.println("Employee " + (i + 1) + " Wage: " + obj[i].calc());
                        }
                    }
                    break;

                case 2:
                    if (count < 10) {
                        obj[count] = new Wage();
                        obj[count].get_data();
                        if(obj[count].calc()==-1)
                        {
                            System.out.println("Not considered as employee");
                        }
                        else{
                        System.out.println("Employee added.");
                        count++;
                        }
                    } else {
                        System.out.println("Maximum limit reached.");
                    }
                    break;

                case 3:
                    System.out.println("Total employees: " + count);
                    break;

                case 4:
                    int total = Wage.totalWages(obj, count);
                    System.out.println("Total wages of all employees: " + total);
                    break;

                case 0:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        s.close();
    }
}
