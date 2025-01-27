import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class Employee implements EmployeeWage {
    int counter = 0;
    int numberOfCompanies;
    ArrayList<CompanyEmployeeWage> CompanyEmployeeWageList;

    Employee(int numberOfCompanies) {
        this.numberOfCompanies = numberOfCompanies;
        CompanyEmployeeWageList = new ArrayList<CompanyEmployeeWage>();
    }

    public void addCompany(String company, int ratePerHour, int days, int maxHours) {
        CompanyEmployeeWage companyempwage = new CompanyEmployeeWage(company, ratePerHour, days, maxHours);
        CompanyEmployeeWageList.add(companyempwage);
    }

    public void computeWage() {
        for (int i = 0; i < CompanyEmployeeWageList.size(); i++)
        {
            CompanyEmployeeWage companyempwage = CompanyEmployeeWageList.get(i);
            companyempwage.setTotalWage(this.employeeWages(companyempwage));
            System.out.println(companyempwage);
            System.out.println("---------------------------------------------------------------------");
        }
    }


    public int getWorkingHours(int check) {
        int hours;
        switch (check) {
            case 1:
                hours = 4;
                break;
            case 2:
                hours = 8;
                break;
            default:
                hours = 0;
                break;
        }
        return hours;
    }

    public int attendanceCheck() {
        int result = (int) Math.floor((Math.random() * 10) % 3);
        return result;
    }

    public int employeeWages(CompanyEmployeeWage companyEmployee)
    {
        int check = 0, workHours = 0, dailySalary = 0, totalSalary = 0, totalHours = 0, totalDays = 0;
        System.out.println("Day\tDaily Hours\tTotal Hours\tDaily Wage\tTotal Wage");
        while (totalHours < companyEmployee.maxHours && totalDays < companyEmployee.days)
        {
            totalDays += 1;
            check = attendanceCheck();
            workHours = getWorkingHours(check);
            totalHours = totalHours + workHours;
            dailySalary = workHours * companyEmployee.ratePerHour;
            companyEmployee.addDailyWage(dailySalary);
        }
        totalSalary = totalHours * companyEmployee.ratePerHour;
        for (int i=0;i<companyEmployee.dailWage.size();i++)
        {
            System.out.println("Wage on day "+(i+1)+" is "+companyEmployee.dailWage.get(i));
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of companies:");
        int noOfCompanies = sc.nextInt();
        EmployeeWage  employeeWageList = new EmployeeWage(noOfCompanies);

        for (int counter = 1; counter <= noOfCompanies; counter++) {
            System.out.println("Enter name of company:");
            String company = sc.next();
            System.out.println("Enter rate per hour:");
            int ratePerHour = sc.nextInt();
            System.out.println("Enter number of working days:");
            int days = sc.nextInt();
            System.out.println("Enter maximum working hours:");
            int maxHours = sc.nextInt();
            employeeWageList.addCompany(company, ratePerHour, days, maxHours);
        }
        employeeWageList.computeWage();
    }

}