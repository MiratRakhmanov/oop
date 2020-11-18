package com.mirat.oop.account;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addCustomer(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Account> findByLastName(String lastName) {
        List<Account> result = new ArrayList<>();
        for (Account account : accounts) {
            if(account.getLastName().equalsIgnoreCase(lastName)) {
                result.add(account);
            }
        }
        return result;
    }

    public List<Account> findByFirstName(String firstName) {
        List<Account> result = new ArrayList<>();
        for (Account account : accounts) {
            if(account.getFirstName().equalsIgnoreCase(firstName)) {
                result.add(account);
            }
        }
        return result;
    }

    public List<Account> findByAvailability(boolean availability) {
        List<Account> result = new ArrayList<>();
        for (Account account : accounts) {
            if(account.isAvailable() == availability) {
                result.add(account);
            }
        }
        return result;
    }

    public List<Account> findByMoneyGreaterThan(int money) {
        List<Account> result = new ArrayList<>();
        for (Account account : accounts) {
            if(account.getMoney() >= money) {
                result.add(account);
            }
        }
        return result;
    }

    public int getTotalMoney(String lastName){
        int result = 0;
        for(Account account : accounts) {
            if(account.isAvailable() && account.getLastName().equalsIgnoreCase(lastName)) {
                result += account.getMoney();
            }
        }
        return result;
    }

    public int getTotalPositive(String lastName) {
        int positive = 0;
        for(Account account : accounts) {
            if(account.isAvailable() && account.getLastName().equalsIgnoreCase(lastName) && account.getMoney() >= 0) {
                positive += account.getMoney();
            }
        }
        return positive;
    }

    public int getTotalNegative(String lastName) {
        int negative = 0;
        for(Account account : accounts) {
            if(account.isAvailable() && account.getLastName().equalsIgnoreCase(lastName) && account.getMoney() < 0) {
                negative += account.getMoney();
            }
        }
        return negative;
    }

    public List<Account> sortByLastName() {
        accounts.sort(Comparator.comparing(Account::getLastName));
        return accounts;
    }

    public List<Account> sortByFirstName() {
        accounts.sort(Comparator.comparing(Account::getFirstName));
        return accounts;
    }

    public List<Account> sortByMoney() {
        accounts.sort(Comparator.comparing(Account::getMoney));
        return accounts;
    }
}
