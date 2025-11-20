
package airlinefinal;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class AirlineFinal {

    public static void main(String[] args) {
        
        login lg = new login();
        lg.log();
        covid co = new covid();
        co.vacine();
    }   
}
class login{
        public void log(){
        Scanner sc = new Scanner(System.in);
         System.out.println("---------------------------");
        System.out.println("WELCOME TO  AIRLINE SYSTEM");
        System.out.println("---------------------------");
        System.out.println("Select \n 1) Login \n 2) Sign_up");
        int num = sc.nextInt();
        switch(num)
        {
            case 1:
            {
                System.out.print("Enter Your Email:  ");
                String log = sc.next();
                System.out.println("\n**YOU HAVE SUCESSFULY LOGIN");
                
                break;
            }
            case 2:
            {
                System.out.print("Enter Your Name: ");
                String name = sc.next();
                System.out.print("Enter Your Email:  ");
                String log = sc.next();                        
                System.out.println("\n**You Have sucessfully Registred");
                break;
            }
        }
        }
 }
class covid{
    public void vacine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DO YOU HAVE COVID 19 CERTIFICATE..!");
        System.out.println("Select \n [1] YES \n [2] NO");
        int num = sc.nextInt();        
        switch(num)
        {
            case 1:
            { 
           System.out.println("Now You Can Book Your Ticket");
           System.out.println("Passenger Details ");
                NewBook bo = new NewBook();
                bo.book();
               break;
            }
             case 2:
            {
                System.out.println("you cannot travel without vaccine!");
             
                break;
            }
         }   
    }
}
abstract class Booking{
    abstract public void book();
}
class NewBook extends Booking{
    @Override
    public void book() {
        String log;
        String log1;
        String log2;
        String log3;
        boolean seat;
        int day, month, year;
        int minute, hour;
        
        try
        {
            Scanner ob = new Scanner(System.in);
            Scanner ob1 = new Scanner(System.in);
            System.out.println("Enter your name");
            log = ob.nextLine();
            System.out.println("Enter your CNIC number");
            log1 = ob1.nextLine();
            System.out.println("Enter the  Name of Airline:\n1:PIA\n2:Airblue\n3:Serene Airways ");
            log2 = ob1.nextLine();
            System.out.println("Enter the Date of Booking(d/m/yyyy) ");
            log3 = ob1.nextLine();
            System.out.println("window seat or not (1)YES OR 0)NO)  ");
            seat=ob.hasNext();
        FileWriter object = new FileWriter("BookTicket.txt");
                object.write("Passenger Name: "+log + "\n");
                object.write("CNIC: "+log1+ "\n");
                object.write("Airline: "+log2+ "\n");
                object.write("Date of flight: "+log3+ "\n");
                object.close();
        }
        catch (Exception ex) {
            System.out.println("unidentified characters");
        }
        try {
            pack.pac();
        } catch (Exception ex) {
            System.out.println("let's do it again!");
           }
    }      
}
class pack{
    public static void pac() throws FileNotFoundException, IOException{
        int oneWay = 5000;
        int twoWay = 10000;
        int sel; double pay = 0;
        Scanner sc = new Scanner(System.in);
         System.out.println("1) Pakistan International AirLine One Way 5000");
        System.out.println("2) Pakistan International AirLine Two Way 10000");
        sel = sc.nextInt();
        switch(sel)
        {  
            case 1:
            {
                System.out.println("Thanks For Selecting One Way");
                System.out.println("You Have to pay "+ oneWay);
                pay = oneWay;
                break;
            }
            case 2:
            {
                System.out.println("Thanks For Selecting Tw0 Way");
                System.out.println("You Have to pay "+ twoWay);
                pay = twoWay;
                break;
            }
            default:{
                System.out.println("please select correct option!");
                pac();
                break;
            }
        }
        int di;
        System.out.println("Thank you For Reserving Your Airline");
        System.out.println("Select any bank for your payment to get discount or enter 4 to proceed:\n 1) Bank al Habib \n 2) Meezan Bank \n 3) Habib Bank Limited");
        di = sc.nextInt();
        
        switch(di)
        {
            case 1:
            {
                System.out.println("Thank You For Selecting Bank Al Habib");
                System.out.println("Discount Offer Rs.2000");
                pay = pay-2000;
                System.out.println("\n After Discout You Will Pay " + pay);
                break;
            }
            case 2:
            {
                System.out.println("Thank You For Selecting Bank Al Habib");
                System.out.println("Discount Offer Rs.1000");
                pay = oneWay-1000;
                System.out.println("\n After Discout You Will Pay " + pay);
                break;
            }
            case 3:
            {
                System.out.println("Thank You For Selecting Bank Al Habib");
                System.out.println("Discount Offer Rs.700");
                pay = oneWay-700;
                System.out.println("\n After Discout You Will Pay " + pay);
                break;
            }
            case 4:{
                break;
            }
            default:{
                System.out.println("please select correct option");
                pac();
                break;
            }
        }
         System.out.println("\n");
        read red = new read();
        red.re();
        System.out.println("\nYour Total Bill is " + pay);
        rand();
    }
      private static void rand(){
          Random abc=new Random();
       int number;
       for(int counter=1;counter<=1;counter++){
           number=0+abc.nextInt(56);
           System.out.println("..................................");
           System.out.println("YOUR BORDING NUMBER IS = "+number);
            System.out.println("..................................");
       }
    }
   
}

class read{
    public void re() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("BookTicket.txt");
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
 
       fr.close();
    }
}