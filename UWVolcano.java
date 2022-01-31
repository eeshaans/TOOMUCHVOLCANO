
/**
 * Write a description of class UWVolcano here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UWVolcano extends SuperVolcano implements java.io.Serializable
{
    // instance variables - replace the example below with your own
    private int x;
    
    String watermass;
    String coolanimals;
    int depth;
    
    
    
    /**
     * Constructor for objects of class UWVolcano
     */
    public UWVolcano()
    {
        super();
        this.watermass = "";
        this.depth = 0;
    }
    
    public UWVolcano(String name, int height, int age, byte VEI, int temperature, boolean extinct, String w, int d){
        super(name, height, age, VEI, temperature, extinct);
        this.watermass = w;
        this.depth = d;
    }

    public String toString(){
    return  "\n\n" + super.toString() + "\nwatermass: " + this.watermass + "\ndepth: " + this.depth + "\n\n";
    }
}
