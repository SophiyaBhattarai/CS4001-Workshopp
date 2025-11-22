import java.util.Scanner;

/**
 * Write a description of class week3workshop here.
 *
 * @author (Sophiya Bhattarai)
 * @version (a version number or a date)
 */
public class week3workshop
{
    public static void main(String[] args){
        Scanner amount= new Scanner(System.in);
        System.out.println("Enter the distance (in KM)");
        float way= amount.nextFloat();
        System.out.println("Enter the time (in minutes)");
        int time= amount.nextInt();
        System.out.println("Time:"+time);
        System.out.println("Are you a local customer, who wants to travel during night?");
        boolean ans=amount.nextBoolean();
        String isAns=(ans==true)?"Awesome! You've got a discount!" : "Wishing you a safe trip";
        System.out.println(isAns);
    }
}