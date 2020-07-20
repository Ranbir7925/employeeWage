import java.util.Random;
public class Employee{
   public static void main (String args[]){
      System.out.println("Welcome to Employee Wage Computation....");
	  
	  Random rand = new Random();
	  int randomCheck=rand.nextInt()%2;
	  
	  if(randomCheck==1)
		  System.out.println("Employee is Present");
	  else
		  System.out.println("Employee is Absent");
	
   }
}