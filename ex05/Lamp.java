
package ex05;

/**
 *
 * @author crist
 */
public class Lamp {
    
    String model;
    int voltage;
    int power;
    String colour;
    String warranty;
    boolean on;
    
    void connect (){
        on = true;
    }
    
    void disconnect (){
        
        on = false;
    }
    
    void showStatus(){
        if(on){
            System.out.println("***The Lamp is ON ***");
        }else{
            System.out.println("*** The lamp is OFF");
        }
        
        
    }
    
    void changeStatus(){
        if(on){
           on = false;
           
           System.out.println("You've just turn the light off ");
        }else{
            on = true;
            
            System.out.println("You've just turn the light on");
        }
    }
    
}
