package lab4;

import java.util.Scanner;
// Sammy Student, Programmer
public class PrattParkingGarage
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
    // the local variables declared and initialized
    char answer = 'Y', specEvent = 'N', rateCode = '\0';
    int ticketNum = 0;
    int timeIn = 0, timeOut = 0, timeDiff = 0;
    double amountTendered = 0.0, changeDue = 0.0;
    double flatFee = 0.0, monthFee = 0.0;
    double EXTRA_CHARGE = 0.0;
    double coupon = 0.0, tip = 0.0;
    double flatTax = 3.00, totalDueFromCust = 0.0;
    double grandTotalDueFromCustomer = 0.0;
    
    System.out.println("");
    System.out.println("");
    System.out.println("***************************");
    System.out.println("----Pratt Parking Garage---");
    System.out.println("***************************");
    System.out.println("");
    System.out.println("");
    while(answer == 'Y' || answer == 'y')
    {
    System.out.println("--------- M E N U ---------");
    System.out.println("data entry process: enter each of these");
    System.out.println("customer ticket number ->");
    ticketNum = sc.nextInt();
    System.out.println("ticket number " + (ticketNum));
    System.out.println("time in (mil time)");
    timeIn = sc.nextInt();
    System.out.println("time out (mil time)");
    timeOut = sc.nextInt();
    timeDiff = timeOut - timeIn;
    System.out.println("time difference " + (timeDiff));
    
    System.out.println("rate code: (F or M)");
    rateCode = sc.next().charAt(0);
    System.out.println("rate code: " + rateCode);
    if (rateCode == 'F')
    {
    flatFee = 10.00;
    totalDueFromCust = flatFee;
    }
    if (rateCode == 'M')
    {
    monthFee = 30.00;
    totalDueFromCust = monthFee;
    }
    else
    monthFee = 0.00;
    System.out.println("tip amount");
    tip = sc.nextDouble();
    System.out.printf("tip: $%.2f\n", tip);
    totalDueFromCust += tip;
    
    System.out.printf("flat tax: $%.2f\n", flatTax);
    totalDueFromCust += flatTax;
    
    System.out.println("special event(Y or N)?");
    specEvent = sc.next().charAt(0);
    if(specEvent == 'Y') EXTRA_CHARGE = 10;
    totalDueFromCust += EXTRA_CHARGE;
    System.out.println("coupon amount");
    coupon = sc.nextDouble();
    totalDueFromCust -= coupon;
    
    System.out.printf("total charge: $%.2f\n", totalDueFromCust);
    
    System.out.println("amount tendered from customer");
    amountTendered = sc.nextDouble();
    changeDue = amountTendered - totalDueFromCust;
    System.out.printf("change: $%.2f\n", changeDue);
    System.out.println("***************************");
    System.out.println("run again(Y or N)?");
    answer = sc.next().charAt(0);
    grandTotalDueFromCustomer += totalDueFromCust;
    }
    System.out.println("***************************");
    System.out.printf("Total amount due: $%.2f\n", grandTotalDueFromCustomer);
    }// end main()
}// end class
