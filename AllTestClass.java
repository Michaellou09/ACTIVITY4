/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author nicko
 */
public class AllTestClass {
    public static void main(String[] args) {
        // Problem 1: Bank Account Money Transfer
        BankAccount acc1 = new BankAccount("001", 1000);
        BankAccount acc2 = new BankAccount("002", 2000);
        Bank bank = new Bank();
        System.out.println("Before Transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
        bank.transferMoney(acc1, acc2, 1500);
        System.out.println("After Transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        // Problem 2: Library Loan System
        Library library = new Library();
        Book book1 = new Book("Introduction of Java Programming and Data Structures", "Y. Daniel Liang", 5);
        Book book2 = new Book("Guinness Book of World Records ", "Jim Pattison Group", 3);
        library.addBook(book1);
        library.addBook(book2);
        System.out.println("\nBefore Loan:");
        library.displayLibrary();
        library.loanBook(book1, 2);
        System.out.println("\nAfter Loan:");
        library.displayLibrary();

        // Problem 3: Student Transfer Between Classrooms
        Classroom classA = new Classroom("Class A");
        Classroom classB = new Classroom("Class B");
        Student student1 = new Student("Zyann", 101);
        Student student2 = new Student("Caryd", 102);
        classA.addStudent(student1);
        classA.addStudent(student2);
        System.out.println("\nBefore Transfer:");
        classA.displayStudents();
        classB.displayStudents();
        classA.transferStudent(student1, classB);
        System.out.println("\nAfter Transfer:");
        classA.displayStudents();
        classB.displayStudents();
    }
}