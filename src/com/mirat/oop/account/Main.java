package com.mirat.oop.account;

import com.mirat.oop.View;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("Rakhmanau", "Mirat", 100);
        Account account2 = new Account("Rakhmanau", "Mirat", 200);
        Account account3 = new Account("Rakhmanau", "Mirat", -300);
        Account account4 = new Account("Zenkevich", "Alex", 400);
        Account account5 = new Account("Rakhmanau", "Mirat", -500);

        Bank bank = new Bank();
        bank.addCustomer(account1);
        bank.addCustomer(account2);
        bank.addCustomer(account3);
        bank.addCustomer(account4);
        bank.addCustomer(account5);

        View.printArrayList(bank.findByLastName("Rakhmanau"));
        System.out.println("*********************");

        View.printArrayList(bank.findByFirstName("Alex"));
        System.out.println("*********************");

        account1.setAvailable(false);
        View.printArrayList(bank.findByAvailability(false));
        System.out.println("*********************");

        View.printArrayList(bank.findByMoneyGreaterThan(200));
        System.out.println("*********************");

        View.printArrayList(bank.sortByLastName());
        System.out.println("*********************");

        View.printArrayList(bank.sortByFirstName());
        System.out.println("*********************");

        View.printArrayList(bank.sortByMoney());
        System.out.println("*********************");

        View.print(bank.getTotalMoney("Rakhmanau"));
        System.out.println("*********************");

        View.print(bank.getTotalPositive("Rakhmanau"));
        System.out.println("*********************");

        View.print(bank.getTotalNegative("Rakhmanau"));
    }
}
