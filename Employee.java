import java.util.*;
public class Employee implements EmployeeWage
{
    int counter=0;
    int numberOfCompanies;
    CompanyEmployeeWage[] CompanyEmployeeWageArray;
    Employee(int n)
    {
        this.numberOfCompanies=n;
        CompanyEmployeeWageArray = new CompanyEmployeeWage[numberOfCompanies];
    }

    public void addCompany(String company,int ratePerHour,int days,int maxHours)
    {
        CompanyEmployeeWageArray[counter++]=new CompanyEmployeeWage(company,ratePerHour,days,maxHours);
    }

    public void computeWage()
    {
        for (int i=0;i<numberOfCompanies;i++)
        {
            CompanyEmployeeWageArray[i].setTotalWage(this.employeeWages(CompanyEmployeeWageArray[i]));
            System.out.println(CompanyEmployeeWageArray[i]);
            System.out.println("------------------------------------------------------------------");

        }
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
        int result=(int)Math.floor((Math.random()*10)%3);
        return result;
    }
    public static void print(int totalDays,int workHours,int totalHours,int dailySalary,int totalSalary)
    {
        System.out.println(totalDays+"\t"+workHours+"\t\t"+totalHours+"\t\t"+dailySalary+"\t\t"+totalSalary);
    }
    public static int employeeWages(CompanyEmployeeWage companyEmployee)
    {
        int check=0,workHours=0,dailySalary=0,totalSalary=0,totalHours=0,totalDays=0;
        System.out.println("Day\tDaily Hours\tTotal Hours\tDaily Wage\tTotal Wage");
        while(totalHours<companyEmployee.maxHours && totalDays<companyEmployee.days)
        {
            totalDays+=1;
            check=attendanceCheck();
            workHours=getWorkingHours(check);
            totalHours=totalHours+workHours;
            dailySalary=workHours*companyEmployee.ratePerHour;
            totalSalary=totalHours*companyEmployee.ratePerHour;
            print(totalDays,workHours,totalHours,dailySalary,totalSalary);
        }
        return totalSalary;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of companies:");
        int noOfCompanies = sc.nextInt();
        Employee employeeWageArray = new Employee(noOfCompanies);

        for (int counter = 1; counter <= noOfCompanies; counter++) {
            System.out.println("Enter name of company:");
            String company = sc.next();
            System.out.println("Enter rate per hour:");
            int ratePerHour = sc.nextInt();
            System.out.println("Enter number of working days:");
            int days = sc.nextInt();
            System.out.println("Enter maximum working hours:");
            int maxHours = sc.nextInt();
            employeeWageArray.addCompany(company, ratePerHour, days, maxHours);
        }
        employeeWageArray.computeWage();
    }
}