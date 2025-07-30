// Exercise 1: Control Structures

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// customer and loan classes
class Customer {
    int id;
    String name;
    int age;
    double balance;
    boolean isVIP;
    List<Loan> loans;

    Customer(int id, String name, int age, double balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.isVIP = false;
        this.loans = new ArrayList<>();
    }
}

// loan class
class Loan {
    int loanId;
    double interestRate;
    LocalDate dueDate;

    Loan(int loanId, double interestRate, LocalDate dueDate) {
        this.loanId = loanId;
        this.interestRate = interestRate;
        this.dueDate = dueDate;
    }
}

// Exercise 1: Control Structures main class

public class exercise1 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        Customer c1 = new Customer(1, "Alpha", 65, 12000);
        c1.loans.add(new Loan(101, 5.5, LocalDate.now().plusDays(20)));
        c1.loans.add(new Loan(102, 6.0, LocalDate.now().plusDays(40)));

        Customer c2 = new Customer(2, "Beta", 45, 8000);
        c2.loans.add(new Loan(103, 7.0, LocalDate.now().plusDays(10)));

        Customer c3 = new Customer(3, "Gamma", 50, 9500);
        c3.loans.add(new Loan(104, 6.5, LocalDate.now().plusDays(25)));

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        // scenario 1: Apply 1% discount to loan interest rates for customers above 60
        for (Customer c : customers) {
            if (c.age > 60) {
            for (Loan l : c.loans) {
            l.interestRate -= 1.0;
            }
            }
        }

        // scenario 2: Set IsVIP to true for customers with balance over 10,000
        for (Customer c : customers) {
            if (c.balance > 10000) {
            c.isVIP = true;
            }
        }

        // scenario 3: Print reminders for loans due in next 30 days
        LocalDate today = LocalDate.now();
        for (Customer c : customers) {
            for (Loan l : c.loans) {
            if (!l.dueDate.isBefore(today) && !l.dueDate.isAfter(today.plusDays(30))) {
            System.out.println("Reminder: Loan " + l.loanId + " for customer " + c.name + " is due on " + l.dueDate);
                }
            }
        }

        // object closed
        customers.clear();
    }
}
