
package ex05;

/**
 *
 * @author crist
 */
public class TestLamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lamp philips = new Lamp();
        
        philips.colour = "yellow";
        philips.power = 100;
        philips.voltage = 220;
        philips.on = false;
        
        Lamp sonic = new Lamp();
        
        sonic.model = "LED";
        sonic.voltage = 220;
        sonic.warranty = "5 messes";
        sonic.colour = "White";
        
        sonic.on = true;
        
        System.out.println("Sonic Lamp Color : " + sonic.colour);
        System.out.println("|Sonic voltage : " + sonic.voltage);
        System.out.println("Status :" + sonic.on);
        sonic.showStatus();
        sonic.changeStatus();
        sonic.connect();
        
        
        System.out.println();
        System.out.println(philips.colour);
        System.out.println(philips.voltage);
        System.out.println(philips.on);
        
       
        philips.showStatus();
        
       philips.changeStatus();
        
    }
    
}
