package util;

public class UtilityFunctions {
	public void isPresent() {
		 int isPresent = (int)(Math.floor(Math.random() * 10)% 3);
		 int wage =0;
		 int fullTimeHours = 8, partTimeHours = 4, wagePerHour = 20;
		 
		 switch (isPresent){
		 case 1 :
			 wage = fullTimeHours * wagePerHour ;
			 System.out.println("Employee is present and wage is "+wage);
			 break;
		 case 2 :
			 wage = partTimeHours * wagePerHour ;
			 System.out.println("Employee is present part time and wage is "+wage);
			 break;
		 case 0 :
			 System.out.println("Employee is absent and wage is "+wage);
			 break;
		default :
			System.out.print("its default case");
		 }
		 
			 
	 }

	

}


