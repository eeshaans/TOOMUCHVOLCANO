
/**
 * Write a description of class volcano here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class volcano
{
    
    int height; 
    int age;
    int temperature;
    byte VEI;
    String name;
    
    
    
   public volcano(){
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
}
