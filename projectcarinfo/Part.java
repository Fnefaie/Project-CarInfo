
package projectcarinfo;

// لأجزاء السيارة 
public class Part {
 private int  ID;
 private String  Model;
 private String  Vendor ;

 // Defult Constructer 
    public Part() {
    }

    public Part(int ID, String Model, String Vendor) {
        this.ID = ID;
        this.Model = Model;
        this.Vendor = Vendor;
    }
                                
    @Override
    public String toString() {
        return   "\nID=" + ID + "\n Model=" + Model + "\n Vendor=" + Vendor ;
    }
 
}