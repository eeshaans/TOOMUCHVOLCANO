/**
 * Write a description of class SuperVolcano here.
 *
 * @author 
 * @version Jan 18, 2021
 */
public class SuperVolcano implements java.io.Serializable
{
    // instance variables - replace the example below with your own
    int height;
    int age;
    String name;
    byte VEI;
    int temperature;
    boolean extinct;
    boolean safe;
    

    /**
     * Constructor for objects of class SuperVolcano
     */
    public SuperVolcano()
    {
        // initialise instance variables
        this.height = 0;
        this.age = 0;
        this.name = "TBD";
        this.VEI = 0;
        this.temperature = 0;
        this.extinct = false;
        this.safe = false;
    }
    
    public SuperVolcano(String name, int height, int age, byte vei, int temp, boolean e){
        this.height = height;
        this.age = age;
        this.name = name;
        this.VEI = vei;
        this.temperature = temp;
        this.extinct = e;
        this.safe = false;
    }
    
    public String toString(){
        return "Name " + this.name + "\nheight " + this.height + "\nage: " + this.age + 
        "\nVEI: " + this.VEI + "\ntemperature " + this.temperature + "\nextinct? " + this.extinct + "\nsafe? " + this.safe;
    }
    
     public void VolcanoSafety()
    {
        if (this.extinct == true)
        {
            this.safe = true ;
        }
        
        else if (this.temperature < 400 && this.VEI < 2)
        {
            this.safe = true ;
        }
        else{
        this.safe = false ;
    }
    }
}