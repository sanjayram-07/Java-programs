import java.io.*;
import java.util.*;

class Customer implements Serializable {
    int custNo;
    String name;
    transient double accBalance;  
    String branchCode;

    Customer(int custNo, String name, double accBalance, String branchCode) {
        this.custNo = custNo;
        this.name = name;
        this.accBalance = accBalance;
        this.branchCode = branchCode;
    }

    void display() {
        System.out.println("Customer No: " + custNo);
        System.out.println("Name: " + name);
        System.out.println("Account Balance: " + accBalance);
        System.out.println("Branch Code: " + branchCode);
        System.out.println("--------------------------------");
    }
}

public class BankCustomer {
    public static void main(String[] args) throws Exception {
        Customer c1 = new Customer(101, "Sanjay", 50000.75, "CH001");

       
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customer.ser"));
        oos.writeObject(c1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.ser"));
        Customer c2 = (Customer) ois.readObject();
        ois.close();

        System.out.println("Deserialized Customer Details:");
        c2.display();
    }
}
