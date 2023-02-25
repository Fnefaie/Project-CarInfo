
package projectcarinfo;

public class SubPart2  extends Part implements InfoPart  {

    // Defult Constructer
    public SubPart2() {
    }

    public SubPart2(int ID, String Model, String Vendor) {
        super(ID, Model, Vendor);
        
    }                              // موصفاتات السيارة الداخلية 
     public void printInfo()
    {
        System.out.println("Airbag, ,Electrical curtain,Cool box, Start_stop button, Internal LEDs,Air Conditioner, Navigation system GPS\n");
    }
}
