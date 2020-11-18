package com.mirat.oop.account;

import java.util.Objects;

public class Account {

    private int accountNumber;
    private double money;
    private boolean available;
    private String lastName;
    private String firstName;

    public Account(String lastName, String firstName, double money) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.money = money;
        this.accountNumber = generateAccountNumber();
        this.available = true;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private int generateAccountNumber() {
        return (int) (Math.random() * (5000 - 1000 + 1)) + 1000;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber &&
                Double.compare(money, account.money) == 0 &&
                available == account.available &&
                Objects.equals(lastName, account.lastName) &&
                Objects.equals(firstName, account.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, money, available, lastName, firstName);
    }

    @Override
    public String toString() {
        return String.format("%-15s%-5s%-10s%-6s%-10s%-10s%-11s%-6s%-6s%-6s", "Account number: ", accountNumber, "| Available: ", available, "| Last name: ", lastName, "| First name: ", firstName, "| Money: ", money);
    }
}
