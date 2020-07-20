import java.util.Random;
public class Employee{
   public static void main (String args[]){
      System.out.println("Welcome to Employee Wage Computation....");
	  int perHr=20;
	  int totalWage=0;
	  int monthlyWage=0;
	  int fullDay=0;
	  int workingDays=20;
	  Random rand = new Random();
	  int randomCheck=rand.nextInt()%3;

	  switch (randomCheck){
		  case 1:
			  System.out.println("Employee is Present for Full Time");
			  fullDay=8;
			  break;
		  case 2:
			  System.out.println("Employee is Present for Part Time");
			  fullDay=4;
			  break;
		  default:
			  System.out.println("Employee is Absent");
			  fullDay=0;
	  }
	totalWage= perHr * fullDay;
	monthlyWage= totalWage * workingDays;
	System.out.println("Total Wage is: "+totalWage);
	System.out.println("Monthly Wage is: "+monthlyWage);
   }
}
