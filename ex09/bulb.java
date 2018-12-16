
package ex09;

/**
 *
 * @author crist
 */
public class bulb {
    
    private String model;
    private String tension;
    private int power;
    private String color;
    private String typeLight;
    private int warranty;
    private String [] types;
    private boolean typeAbajur;
   private boolean on;
   
      public bulb(String model, String tension, int power, String color, String typeLight, int warranty, String[] types, boolean typeAbajur, boolean on) {
        this.model = model;
        this.tension = tension;
        this.power = power;
        this.color = color;
        this.typeLight = typeLight;
        this.warranty = warranty;
        this.types = types;
        this.typeAbajur = typeAbajur;
        this.on = on;
    }
    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeLight() {
        return typeLight;
    }

    public void setTypeLight(String typeLight) {
        this.typeLight = typeLight;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public boolean isTypeAbajur() {
        return typeAbajur;
    }

    public void setTypeAbajur(boolean typeAbajur) {
        this.typeAbajur = typeAbajur;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public bulb() {
    }
    
    public void turnOn(){
        on = true;
        
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void showStatus(){
        if(isOn()){
            System.out.println("The light is ON");
        }else{
            System.out.println("The light is OFF");
        }
    }
    
    public void changeStatus(){
        if (isOn()){
            turnOff ();
        }else{
            turnOn();
        }
    }

 
    
}
