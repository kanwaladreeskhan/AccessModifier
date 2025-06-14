 package accessmodifier;
import java.util.Scanner;
public class AccessModifier {
    public static void main(String[] args) {
        Sphere c=new Sphere();
        System.out.println("Information of sphere:");
        System.out.println("----------------------");
         c.setradius(5.5);
         System.out.println("Radius of sphere= "+c.getradius());
          c.setheight(11);
         System.out.println("Height of sphere= "+c.getheight());
          System.out.println("area of sphere= "+c.surfacearea());
            System.out.println("volume of sphere= "+c.volume());
    }
    }
