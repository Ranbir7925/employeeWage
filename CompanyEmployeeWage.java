import java.util.*;

public class CompanyEmployeeWage
{
	public static final int isPartTime=1;
    public static final int isFullTime=2;
    
    public String company;
    public int ratePerHour;
    public int days;
    public int maxHours;
    public int totalWage;
    public ArrayList<Integer> dailWage;
    CompanyEmployeeWage(String company,int ratePerHour,int days,int maxHours)
    {
        this.company=company;
        this.ratePerHour=ratePerHour;
        this.days=days;
        this.maxHours=maxHours;
        dailWage=new ArrayList<Integer>();
    }
    public void setTotalWage(int totalWage)
    {
    	this.totalWage=totalWage;
    }
    @Override
    public String toString()
    {
    	return "Employee wage in company "+company+" is "+totalWage;
    }
    public void addDailyWage(int dailySalary)
    {
        this.dailWage.add(dailySalary);
    }
}