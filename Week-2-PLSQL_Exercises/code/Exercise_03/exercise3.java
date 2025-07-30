// Exercise 3: Stored Procedures

import java.util.*;

class SavingsAccount {
    int accountNumber;
    double currentBalance;

    SavingsAccount(int accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }
}

class Employee {
    int employeeId;
    String department;
    double currentSalary;

    Employee(int employeeId, String department, double currentSalary) {
        this.employeeId = employeeId;
        this.department = department;
        this.currentSalary = currentSalary;
    }
}

class Account {
    int accountId;
    double availableBalance;

    Account(int accountId, double availableBalance) {
        this.accountId = accountId;
        this.availableBalance = availableBalance;
    }
}

public class exercise3 {
    public static void processMonthlyInterest(List<SavingsAccount> savingsAccounts) {
        for (SavingsAccount account : savingsAccounts) {
            account.currentBalance = account.currentBalance * 1.01;
        }
    }

    public static void updateEmployeeBonus(List<Employee> employeeList, String targetDept, double bonusRate) {
        for (Employee worker : employeeList) {
            if (worker.department.equals(targetDept)) {
                worker.currentSalary = worker.currentSalary + worker.currentSalary * bonusRate / 100;
            }
        }
    }

    public static boolean transferFunds(Account sourceAccount, Account destinationAccount, double transferAmount) {
        if (sourceAccount.availableBalance >= transferAmount) {
            sourceAccount.availableBalance = sourceAccount.availableBalance - transferAmount;
            destinationAccount.availableBalance = destinationAccount.availableBalance + transferAmount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<SavingsAccount> savingsAccounts = new ArrayList<>();
        savingsAccounts.add(new SavingsAccount(1, 156000));
        savingsAccounts.add(new SavingsAccount(2, 292000));
        processMonthlyInterest(savingsAccounts);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "IT", 55000));
        employeeList.add(new Employee(2, "HR", 48000));
        updateEmployeeBonus(employeeList, "IT", 10);

        Account account1 = new Account(1, 82400);
        Account account2 = new Account(2, 37500);
        transferFunds(account1, account2, 20500);

        // print results
        System.out.println("Savings Account 1: " + savingsAccounts.get(0).currentBalance);
        System.out.println("Savings Account 2: " + savingsAccounts.get(1).currentBalance);
        System.out.println("Employee 1: " + employeeList.get(0).currentSalary);
        System.out.println("Employee 2: " + employeeList.get(1).currentSalary);
        System.out.println("Account 1: " + account1.availableBalance);

        // object closed
        savingsAccounts.clear();
        employeeList.clear();

    }
}
