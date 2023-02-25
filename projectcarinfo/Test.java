
package projectcarinfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws InvalidManufacturingYearException {
      
        Scanner input = new Scanner(System.in);
        ArrayList<Car> carlist = new ArrayList<Car>();
        SubPart1 t1=new  SubPart1();
        SubPart2 t11=new SubPart2() ;
        int exit = 1;
        
        // 1 Menue
        while (exit == 1) {
            System.out.println("1- Add a new car");
            System.out.println("2- Print all cars information");
            System.out.println("3- Exit the program");
            int select = input.nextInt();
            // add car
            if (select == 1) {

                System.out.println("Enter ID ");
                int i = input.nextInt();
                System.out.println("Enter model");
                String n = input.next();
                System.out.println("Enter Vendor");
                String a = input.next();
                System.out.println("Enter Manufacturing_Year");
                int d = input.nextInt();
                System.out.println("Enter Price");
                float b = input.nextFloat();
                

                Car c1 = new Car(i, n, a, d, b );
                System.out.println("enter number of part for sub1");
                int p1=input.nextInt();
                for (int j = 0; j < p1; j++) {
                    System.out.println("enter id");
                 int d1=input.nextInt();
                    System.out.println("enter Model");
                    String d2=input.next();
                    System.out.println("enter Vendor");
                    String d3=input.next();
                            t1 = new SubPart1(d1,d2,d3);
                            c1.addPart(t1);
                   carlist.add(c1);
                }
               System.out.println("enter number of part for sub2");
                int p2=input.nextInt();
                for (int j = 0; j < p2; j++) {
                    System.out.println("enter id");
                    int d1=input.nextInt();
                    System.out.println("enter Model");
                    String d2=input.next();
                    System.out.println("enter Vendor");
                    String d3=input.next();
                            t11 = new SubPart2(d1,d2,d3);
                            c1.addPart(t11);
                   carlist.add(c1);
                }
               
// 2 Print informations car 
            } else if (select == 2) {
                for (int i = 0; i < carlist.size(); i++) {
                    System.out.println(carlist.get(i));
                }
                t1.printInfo();
                t11.printInfo();
                
                // 3 To exit program
            } else if (select == 3) {
                System.out.println("Thank You ....");
                exit = 0;
            } else {
                System.out.println("error.enter choise");
            }
            
        }
    }
}
