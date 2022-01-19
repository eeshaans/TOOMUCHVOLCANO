

/**
 * Write a description of class SuperVolcano here.
 *
 * @author 
 * @version Jan 18, 2021
 */
public class SuperVolcano
{
    // instance variables - replace the example below with your own
    int height;
    int age;
    String name;
    byte VEI;
    int temperature;
    boolean safe;
    boolean extinct;

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
    }
    
    public SuperVolcano(int height, int age, String name, byte vei, int temp){
        this.height = height;
        this.age = age;
        this.name = name;
        this.VEI = vei;
        this.temperature = temp;
    }
    
    
    public boolean VolcanoSafety()
    {
        if (this.extinct == true)
        {
            return true ;
        }
        
        if (this.temperature < 400 && this.VEI < 2)
        {
            return true ;
        }
        
        return false ;
    }
}
