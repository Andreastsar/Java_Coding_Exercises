package com.company;

public class BankAccount {

    private String accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount(String customerName, String email, String phone) {
        this("99999",100.55,customerName,email,phone);
    }

    public BankAccount(){
        this("56789",2.5,"Default name","Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accNumber, double balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if (withdrawAmount - this.balance < 0) {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance: " + this.balance);
       } else {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }
    }
}