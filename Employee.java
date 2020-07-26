import java.util.*;
public class Employee {

    public static final int isPartTime=1;
    public static final int isFullTime=2;

    static int ratePerHour;
    static int maxHours;
    static int days;
    static int totalWage;
    static String company;
    Employee(String company,int ratePerHour,int days,int maxHours)
    {
        this.company=company;
        this.ratePerHour=ratePerHour;
        this.days=days;
        this.maxHours=maxHours;
    }
    public static int getWorkingHours(int check)
    {
        int hours;
        switch(check)
        {
            case 1:
                hours=4;
                break;
            case 2:
                hours=8;
                break;
            default:
                hours=0;
                break;
        }
        return hours;
    }
    public static int attendanceCheck()
    {
        Random rand = new Random();
        int randomCheck=rand.nextInt()%3;;
        return randomCheck;
    }
    public static void print(int totalDays,int workHours,int totalHours,int dailySalary,int totalSalary)
    {
        System.out.println(totalDays+"\t"+workHours+"\t\t"+totalHours+"\t\t"+dailySalary+"\t\t"+totalSalary);
    }
    public static void employeeWages()
    {
        int check=0,workHours=0,dailySalary=0,totalSalary=0,totalHours=0,totalDays=0;
        System.out.println("Day\tDaily Hours\tTotal Hours\tDaily Wage\tTotal Wage");
        while(totalHours<maxHours && totalDays<days)
        {
            totalDays+=1;
            check=attendanceCheck();
            workHours=getWorkingHours(check);
            totalHours=totalHours+workHours;
            dailySalary=workHours*ratePerHour;
            totalSalary=totalHours*ratePerHour;
            print(totalDays,workHours,totalHours,dailySalary,totalSalary);
        }
        totalWage= totalSalary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of companies:");
        int noOfCompanies=sc.nextInt();
        for(int counter=1;counter<=noOfCompanies;counter++)
        {
            System.out.println("Enter name of company:");
            String company=sc.next();
            System.out.println("Enter rate per hour:");
            int ratePerHour=sc.nextInt();
            System.out.println("Enter number of working days:");
            int days=sc.nextInt();
            System.out.println("Enter maximum working hours:");
            int maxHours=sc.nextInt();
            Employee companyname=new Employee(company,ratePerHour,days,maxHours);
            companyname.employeeWages();
            System.out.println("Employee wage in company "+companyname.company+" is "+companyname.totalWage);
        }
    }
}