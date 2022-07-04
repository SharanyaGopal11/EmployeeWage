package util;

public class UtilityFunctions {
	public void isPresent() {
		 int wage =0, wageDay = 0;
		 int fullTimeHours = 8, partTimeHours = 4, wagePerHour = 20;
		 
		 for ( int i = 0; i< 20; i++){
			 int isPresent = (int)(Math.floor(Math.random() * 10)% 3);
			 if (isPresent == 1){
				 wageDay = fullTimeHours * wagePerHour;
			 }
			 if (isPresent == 2){
				 wageDay = partTimeHours * wagePerHour;
			 }
			 wage = wage + wageDay;
		 }
		 
		 System.out.print("Employee one month wage is "+wage);
			 
	 }

	

}


