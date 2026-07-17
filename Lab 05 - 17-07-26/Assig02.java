// WAP in Java to develop a Restaurant Billing Application where overloaded methods calculate bills for dine-in, takeaway, and delivery orders, while static variables track total orders.

public class Assig02
{
    static int totalorders;

    public static void CalBill(double dinebill) // Function To Calculate Bill For Dine-In
    {
        double finalbill = dinebill;
        System.out.println("Dine-In Bill:");
        System.out.println("Amount = "+finalbill);
    }

    public static void CallBill(double takebill, double charges) // Function To Calculate Bill For TakeAway
    {
        double finalbill = takebill + charges;
        System.out.println("Take-Away Bill:");
        System.out.println("Extra Charges = "+charges);
        System.out.println("Amount = "+finalbill);
    }

    public static void CallBill(double deliverybill, double charges, double deliverycharge) // Function To Calculate Bill For Delivery
    {
        double finalbill = deliverybill + charges + deliverycharge;
        System.out.println("Delivery Bill:");
        System.out.println("Extra Charges = "+charges);
        System.out.println("Delivery Charges = "+deliverycharge);
        System.out.println("Amount = "+finalbill);
    }

    public static void main(String args[]) // Main Method
    {

    }
}

// Aim
// Screenshot
// Extra