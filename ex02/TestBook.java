
package ex02;

/**
 *
 * @author crist
 */
public class TestBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Book DataBase = new Book();
        DataBase.author = "Greg South";
        DataBase.name = "Data Base vol1";
        DataBase.type = "Technology Information";
        DataBase.year = 2010;
        DataBase.numberOfPage = 200;
        
        Book Java = new Book();
        Java.author = "Fernandes";
        Java.name = " Java vol 3";
        Java.type = "Technology Information";
        Java.numberOfPage = 300;
        
        Book Food = new Book();
        Food.name = "Dinner for two";
        Food.type = "Alimentation";
        Food.numberOfPage = 250;
        Food.year = 2016;
        Food.publisher = "Sarayva";
        
        System.out.println("Book :" + DataBase.name);
        System.out.println("Author :" + DataBase.author);
        System.out.println("Type :" + DataBase.type);
        System.out.println();
        System.out.println("Book :" + Java.name);
        System.out.println("Author :" + Java.author);
        System.out.println("Type :" + Java.type);
        System.out.println();
        System.out.println("Name :" + Food.name);
        System.out.println("Type :" + Food.type);
        System.out.println("Year :" + Food.year);
    }
    
}
