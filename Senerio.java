import java.util.Scanner;

/**
 * Write a description of class Senerio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Senerio
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        double base= 20;
        double rateKm= 30;
        double rateMin= 2;
        System.out.print("Enter the distance in km:");
        double km= s.nextDouble();
        System.out.print("Enter time in minutes:");
        double min= s.nextDouble();
        System.out.print("is customer local(yes/no):");
        String local= s.next();
        System.out.print("Is it night(yes/no):");
        String night= s.next();
        double fare= base+(km*rateKm)+(min*rateMin);
        if(local.equalsIgnoreCase("yes")){
            if(km>10){
                fare= fare-(fare*0.10);
            }
        }
        if(night.equalsIgnoreCase("yes")){
            fare= fare+(fare*0.20);
        }
        System.out.println("final fare= Rs"+fare);
    }
}