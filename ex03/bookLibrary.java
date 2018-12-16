/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author crist
 */
public class bookLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Library Book = new Library();
        
        Book.author = "Greg South";
        Book.name = "Data Base vol1";
        Book.type = "Technology Information";
        Book.year = 2010;
        Book.numberOfPage = 200;
        Book.price = 65.5;
        
          Library Book1  = new Library();
        Book1.author = "Fernandes";
        Book1.name = " Java vol 3";
        Book1.type = "Technology Information";
        Book1.numberOfPage = 300;
        Book1.price = 123.4;
        
        
        System.out.println("Book = " + Book.name);
        System.out.println("Price = " + Book.price);
        System.out.println();
        System.out.println("Book = " + Book1.name);
        System.out.println("Price = " + Book1.price);
    }
    
}
