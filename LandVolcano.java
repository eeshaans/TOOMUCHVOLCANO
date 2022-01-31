/**
 * A sub class for Supervolcano
 *
 * @author 
 * @version Jan 19, 2021
 */
public class LandVolcano extends SuperVolcano implements java.io.Serializable
{
    // instance variables - replace the example below with your own
    String city, country;
    int altitude;//height where the volcano is locate
    

    /**
     * Constructor for objects of class SubVolcano
     */
    public LandVolcano()
    {
        super();//super construct
        // initialise instance variables
        this.city = "TBD";
        this.country = "TBD";
        this.altitude = 0;
    }
    
    public LandVolcano(String n, int h, int a, byte vei, int t, boolean e, 
    String city, String country, int altitude){
        super(n, h, a, vei, t, e);
        this.city = city;
        this.country = country;
        this.altitude = altitude;
        
    }
    
    public String toString(){
        return String.format(super.toString()+"\nCity: %s\nCountry: %s\nAltitude: %d\n"
        , this.city, this.country, this.altitude);
    }
}