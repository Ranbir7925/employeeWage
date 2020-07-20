import java.util.Random;
public class Employee{
   public static void main (String args[]){
      System.out.println("Welcome to Employee Wage Computation....");
	  int perHr=20;
	  int totalWage=0;
	  int fullDay=0;
	  Random rand = new Random();
	  int randomCheck=rand.nextInt()%2;
	  
	    if(randomCheck==1){
		  System.out.println("Employee is Present");
		  fullDay=8;}
	    else{
		  System.out.println("Employee is Absent");
		  fullDay=0;}
	totalWage= perHr * fullDay;
	System.out.println("Toatl Wage is "+totalWage);
   }
}