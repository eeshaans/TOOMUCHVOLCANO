
/**
 * Write a description of class UWVolcano here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UWVolcano extends SuperVolcano
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
    
    
    
    public static void main(String[] args){
       UWVolcano[] volcanoes = new UWVolcano[5];
        
        UWVolcano one = new UWVolcano("Hunga Tonga-Hunga-Ha'apai", 114, 109, (byte)5, 1200, false, "south-pacific ocean", 390000);
           UWVolcano two = new UWVolcano("Orca Seamount", 1000, 42, (byte)0, 1200, true, "antaricartic ocean", 500);
           UWVolcano three = new UWVolcano("Ibugos", 114, -24, (byte)1, 1500, true, "pacific ocean", 600);
           UWVolcano four = new UWVolcano("Amongos", -160, 33000000, (byte)2, 1500, false, "pacific-ocean",  397);
        UWVolcano five = new UWVolcano("Cobb Seamount", 34, 3300000, (byte)3, 964, true, "Gray's Harbor", 2600);
        
        volcanoes[0] = one;
        volcanoes[1] = two;
        volcanoes[2] = three;
        volcanoes[3] = four;
        volcanoes[4] = five;
        
        for(int i = 0; i <5 ; i++){
            System.out.println(volcanoes[i]);
        }
    }

    
    
}
