import java.util.Scanner;

class Employee {
    String empName, address, mailId, mobileNo;
    int empId;

    Employee(String empName, int empId, String address, String mailId, String mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    void display() {
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Address       : " + address);
        System.out.println("Mail ID       : " + mailId);
        System.out.println("Mobile No     : " + mobileNo);
    }
}

class Programmer extends Employee {
    double basicPay, da, hra, pf, staffFund, grossSalary, netSalary;

    Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void getPaySlip() {
        da = basicPay * 0.97;
        hra = basicPay * 0.10;
        pf = basicPay * 0.12;
        staffFund = basicPay * 0.001;
        grossSalary = basicPay + da + hra;
        netSalary = grossSalary - pf - staffFund;
    }

    void disp() {
        System.out.println("\n***** Programmer Payslip *****");
        display();
        System.out.println("Basic Pay    : " + basicPay);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Net Salary   : " + netSalary);
    }
}

class AssistantProfessor extends Programmer {
    AssistantProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void disp() {
        System.out.println("\n***** Assistant Professor Payslip *****");
        display();
        System.out.println("Basic Pay    : " + basicPay);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Net Salary   : " + netSalary);
    }
}

class AssociateProfessor extends Programmer {
    AssociateProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void disp() {
        System.out.println("\n***** Associate Professor Payslip *****");
        display();
        System.out.println("Basic Pay    : " + basicPay);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Net Salary   : " + netSalary);
    }
}

class Professor extends Programmer {
    Professor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void disp() {
        System.out.println("\n***** Professor Payslip *****");
        display();
        System.out.println("Basic Pay    : " + basicPay);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Net Salary   : " + netSalary);
    }
}

public class EmployeePayslip{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Mail ID: ");
        String mail = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        double bp = sc.nextDouble();

        System.out.println("\n1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.print("Enter Designation: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                Programmer p = new Programmer(name, id, address, mail, mobile, bp);
                p.getPaySlip();
                p.disp();
                break;

            case 2:
                AssistantProfessor ap = new AssistantProfessor(name, id, address, mail, mobile, bp);
                ap.getPaySlip();
                ap.disp();
                break;

            case 3:
                AssociateProfessor asp = new AssociateProfessor(name, id, address, mail, mobile, bp);
                asp.getPaySlip();
                asp.disp();
                break;

            case 4:
                Professor pr = new Professor(name, id, address, mail, mobile, bp);
                pr.getPaySlip();
                pr.disp();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
