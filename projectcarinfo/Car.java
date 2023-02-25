
package projectcarinfo;

import java.util.ArrayList;

public class Car {

private int ID;
private String Model;
private String Vendor;
private int Manufacturing_Year ; 
private float Price;
ArrayList<SubPart1>parts1 ; 
ArrayList<SubPart2>parts2 ; 

//Constructer
    public Car(int ID, String Model, String Vendor, int Manufacturing_Year, float Price) throws InvalidManufacturingYearException {
        this.ID = ID;
        this.Model = Model;
        this.Vendor = Vendor;
        setManufacturing_Year(Manufacturing_Year);
        this.Price = Price;
        parts1 = new ArrayList<SubPart1>();
        parts2 = new ArrayList<SubPart2>();
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getModel() {
   return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    public int getManufacturing_Year() {
        return Manufacturing_Year;
    }

    public void setManufacturing_Year(int Manufacturing_Year) throws InvalidManufacturingYearException {
        if(Manufacturing_Year>=1995&&Manufacturing_Year<=2022)
        this.Manufacturing_Year = Manufacturing_Year;
        else 
            throw new InvalidManufacturingYearException("Manufacturing Year should be from 1995 to 2022!");
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    // ميثود لإضافة الأجزاء الخارجية
    public void addPart(SubPart1 p)
    {
        parts1.add(p);
    }
    // ميثود لإضافة الأجزاء الداخلية 
     public void addPart(SubPart2 p)
    {
        parts2.add(p);
    }

    @Override
                       //toString (لطباعة بيانات السيارة كاملة + Part1 and part2 )
                       //حلقتين for للمرور على جميع اجزاء السياره الداخليه والخارجية
 
    public String toString() {
        String s=  "\nID=" + ID + "\n Model=" + Model + "\n Vendor=" + Vendor + "\nManufacturing_Year=" + Manufacturing_Year + "\nPrice=" + Price  ;
        for (int i = 0; i < parts1.size(); i++) {
        s=s+parts1.get(i).toString();
        }
        for (int i = 0; i < parts2.size(); i++) {
        s=s+parts2.get(i).toString();
        }
        return s;
    }

}
