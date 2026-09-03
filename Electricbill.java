import java.util.Scanner;

public class Electricbill {
    public static void main(String[] args) {
        Consumer ob = new Consumer();
        ob.getData();
        ob.calc();
        ob.display();
    }
}

class Consumer {
    Scanner in = new Scanner(System.in);

    int cno;
    String cname, typeOfConn;
    double preReading, currReading, unitConsumed, tbill;

    void getData() {
        System.out.print("Enter Consumer Number: ");
        cno = in.nextInt();
        in.nextLine(); // Clear the input buffer

        System.out.print("Enter Consumer Name: ");
        cname = in.nextLine();

        System.out.print("Enter Type of Connection (Domestic/Commercial): ");
        typeOfConn = in.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        preReading = in.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        currReading = in.nextDouble();
    }

    void calc() {
        unitConsumed = currReading - preReading;

        if (typeOfConn.equalsIgnoreCase("Domestic")) {
            if (unitConsumed <= 100)
                tbill = unitConsumed * 1;
            else if (unitConsumed <= 200)
                tbill = unitConsumed * 2.5;
            else if (unitConsumed <= 500)
                tbill = unitConsumed * 4;
            else
                tbill = unitConsumed * 6;
        } 
        else if (typeOfConn.equalsIgnoreCase("Commercial")) {
            if (unitConsumed <= 100)
                tbill = unitConsumed * 2;
            else if (unitConsumed <= 200)
                tbill = unitConsumed * 4.5;
            else if (unitConsumed <= 500)
                tbill = unitConsumed * 6;
            else
                tbill = unitConsumed * 7;
        } 
        else {
            System.out.println("Invalid Connection Type!");
            tbill = 0;
        }
    }

    void display() {
        System.out.println("\n------ Electricity Bill ------");
        System.out.println("Consumer Number : " + cno);
        System.out.println("Consumer Name   : " + cname);
        System.out.println("Connection Type : " + typeOfConn);
        System.out.println("Units Consumed  : " + unitConsumed);
        System.out.println("Total Bill      : Rs. " + tbill);
    }
}
