
package ex01;

/**
 *
 * @author crist
 */
public class TestLamp {

   
    public static void main(String[] args) {
        
        Lamp A = new Lamp();
        A.brand = "Phillips";
        A.colour = "Red";
        A.Size = "Big";
        A.type = "Led";
        A.voltage = 60;
        A.price = 5.80;
        
        Lamp B = new Lamp();
        B.brand = "Panasonic";
        B.colour = "Withe";
        B.Size = "Small";
        B.type = "Led";
        B.voltage = 120;
        B.price = 7.50;
                
        
        Lamp C = new Lamp();
        C.brand = "Phillips";
        C.colour = "Yellow";
        C.Size = "Midium";
        C.type = "Led";
        C.voltage = 220;
        C.price = 11.50;

        System.out.println(A.brand);
        System.out.println(A.price);
        System.out.println();
        System.out.println(B.brand);
        System.out.println(B.voltage);
        System.out.println();
        System.out.println(C.brand);
        System.out.println(C.price);
        System.out.println(C.colour);
        
    }
    
}
