package com.company;

public class Main {

    public static void main(String[] args) {
//        BankAccount antreasAccount = new BankAccount("12345",25.00,"Antreas", "antreas@gmail.com", "6948892490");

        BankAccount antreasAccount = new BankAccount();

        System.out.println(antreasAccount.getAccNumber());
        System.out.println(antreasAccount.getBalance());

        antreasAccount.withdraw(100.0);

        antreasAccount.deposit(50.0);
        antreasAccount.withdraw(100.0);

        antreasAccount.deposit(51.0);
        antreasAccount.withdraw(100.0);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Antreas", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Bob", 100.00, "bob@email.com");
        System.out.println(person3.getName());
    }
}
