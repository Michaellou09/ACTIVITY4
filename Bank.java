/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author nicko
 */
class Bank {
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Transfer successful: " + amount + " transferred from " + from.getAccountNumber() + " to " + to.getAccountNumber());
        }
    }
}
