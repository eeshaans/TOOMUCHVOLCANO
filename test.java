
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String[] args){
        SuperVolcano[] volcanoes = new SuperVolcano[15];

        UWVolcano one = new UWVolcano("Hunga Tonga-Hunga-Ha'apai", 114, 109, (byte)5, 1200, false, "south-pacific ocean", 390000);
        UWVolcano two = new UWVolcano("Orca Seamount", 1000, 42, (byte)0, 1200, true, "antaricartic ocean", 500);
        UWVolcano three = new UWVolcano("Ibugos", 114, -24, (byte)1, 1500, true, "pacific ocean", 600);
        UWVolcano four = new UWVolcano("Amongos", -160, 33000000, (byte)2, 1500, false, "pacific-ocean",  397);
        UWVolcano five = new UWVolcano("Cobb Seamount", 34, 3300000, (byte)3, 964, true, "Gray's Harbor", 2600);

        LandVolcano six = new LandVolcano("Mount Kilimanjaro", 5895, 3000000, (byte)0, 20, 
                true, "Kilimanjaro", "Tanzania", 995);
        LandVolcano seven = new LandVolcano("Mount Fuji", 3776, 2600000, (byte)6, 7270,
                true, "Tokyo", "Japen", 0);
        LandVolcano eight = new LandVolcano("Mount St. Helens", 2549, 40000, (byte)5, 727,
                false, "Washington State", "United State", 1300);
        LandVolcano nine = new LandVolcano("Mount Vesuvius", 1281, 25000, (byte)5, 0,
                true, "Campania", "Italy", 49);
        LandVolcano ten = new LandVolcano("Mayon Volcano", 2463, 20000, (byte)5, 140,
                false, "Albay", "Philippines", 16);
        LandVolcano eleven = new LandVolcano("Mount Merapi", 2910, 400000, (byte)0, 2,
                false, "Central Java", "Indonesia", 1700);
        LandVolcano twelve = new LandVolcano("Mount Etna", 3357, 500000, (byte)3, 7000,
                false, "Catania", "Italy", 429);
        LandVolcano thirteen = new LandVolcano("Mauna Loa", 4169, 1000000, (byte)1, 6200,
                false, "Hawaii", "United State", 2011);
        LandVolcano fourteen = new LandVolcano("Mount Pelee", 1397, 89, (byte)4, 1500,
                false, "Martinique", "Caibbean", 0);
        LandVolcano fifteen = new LandVolcano("Mount Tambora", 2850, 10000, (byte)7, 1500,
                false, "Sumbawa", "Indonesia", 128);

        
        volcanoes[0] = one;
        volcanoes[1] = two;
        volcanoes[2] = three;
        volcanoes[3] = four;
        volcanoes[4] = five;   
        volcanoes[5] = six;
        volcanoes[6] = seven;
        volcanoes[7] = eight;
        volcanoes[8] = nine;
        volcanoes[9] = ten;
        volcanoes[10] = eleven;
        volcanoes[11] = twelve;
        volcanoes[12] = thirteen;
        volcanoes[13] = fourteen;
        volcanoes[14] = fifteen;

        for(int i = 0; i<15 ; i++){
            volcanoes[i].VolcanoSafety();

            if(volcanoes[i].safe == true){
                System.out.println(volcanoes[i]);
            }
        } 
    }
}
