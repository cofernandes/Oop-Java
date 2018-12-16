/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

/**
 *
 * @author crist
 */
public class CCTLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Library Book = new Library();
        
        Book.name = "Java";
        Book.isbn = "45631der7h8";
        Book.borrowed = "08/08/18";
        Book.devolve = "18/08/18";
        
        Library Book1 = new Library();
        
        Book1.name = "Data Base";
        Book1.isbn = "45631der7h8";
        Book1.borrowed = "08/08/18";
        Book1.devolve = "18/08/18";
        
        System.out.println("Book = " + Book.name);
        System.out.println("Register = " + Book.isbn);
        System.out.println("Data Borrowed = " + Book.borrowed);
        System.out.println("Data to Devolve = " + Book.devolve);
        
        System.out.println();
        
        System.out.println("Book = " + Book1.name);
        System.out.println("Register = " + Book1.isbn);
        System.out.println("Data Borrowed = " + Book1.borrowed);
        System.out.println("Data to Devolve = " + Book1.devolve);
    }
}