import java.util.Random;
public class Employee{
	int wagePerHr=20;
	public void checkAttendance(){
		int isPresent=1;
		int isAbsent=0;
		Random random=new Random();
		int randomNumber=random.nextInt(2);
		if (randomNumber==isPresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
	public int getDailWage(){
		int fullDayhrs=8;
		int dailyWage = wagePerHr * fullDayhrs;
		return dailyWage;
	}
	public int getPartTimeWage(){
		int partTimeHrs=4;
		int partTimeWage = wagePerHr * partTimeHrs;
		return partTimeWage;
	}
	public int checkEmployee(int random){
		int isFullTime=1;
		int isPartTime=2;
		switch(random){
			case 1:
				return getDailWage();
			case 2:
				return getPartTimeWage();
		}
		return 0;
	}

	public void monthlyWage()
	{
	  Random rand = new Random();
	  int count1=0;
	  int monthlyWage=0;
	  int wage=0;

	  while(count1 !=20){
	  	wage=checkEmployee(rand.nextInt(3));
	  	monthlyWage+=wage;
	  	count1++;
	  }
		System.out.println("Monthly Wage is: "+monthlyWage);
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
		Employee object=new Employee();
		object.monthlyWage();

	}
}
