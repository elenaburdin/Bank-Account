package com.company;

public class Main {
    public static void main(String[] args) {
//        BankAccount lenasAccount = new BankAccount();
//
//        System.out.println(lenasAccount.getAccountNumber());
//        System.out.println(lenasAccount.getBalance());
//
//        lenasAccount.deposit(50.00);
//        System.out.println("Customers deposit is: " + lenasAccount.getBalance());
//        lenasAccount.withdraw(20);
//        lenasAccount.withdraw(140);
//
//        BankAccount timsAccount = new BankAccount("Tim", "tims@email.com", "88647");
//        System.out.println(timsAccount.getPhoneNumber() + ", name: " + timsAccount.getCustomerName());

        VipCustomer joesAccount = new VipCustomer();
        System.out.println(joesAccount.getName());

        VipCustomer jennasAccount = new VipCustomer("Jenna Smith", 1200.50);
        System.out.println("name: " + jennasAccount.getName() + ", credit limit: " + jennasAccount.getCreditLimit() +
                jennasAccount.getEmail());

        VipCustomer stevesAccount = new VipCustomer("Steve Vip", 1000.0, "steve@email.com");
        System.out.println("name: " + stevesAccount.getName() + ", credit limit: " + stevesAccount.getCreditLimit() +
                ", email: " + stevesAccount.getEmail());


    }
}