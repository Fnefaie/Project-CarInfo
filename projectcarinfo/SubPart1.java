
package projectcarinfo;

// وراثه من كلاس اجزاء السيارة 
public class SubPart1 extends Part implements InfoPart {

// defult constructer
    public SubPart1() {
    }

    public SubPart1(int ID, String Model, String Vendor) {
        super(ID, Model, Vendor);
    }
    
                         // مواصفات السياره الخارجية 
 public void printInfo()
    {
        System.out.println(" Remote control system,car sunroof, Rear camera, Xenon lights,Front spoiler , Crawl system \n");
    }
}