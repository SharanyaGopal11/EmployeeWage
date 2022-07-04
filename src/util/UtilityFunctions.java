package util;

public class UtilityFunctions {
	public void isPresent() {
		 int wage =0, wageDay = 0;
		 int fullTimeHours = 8, partTimeHours = 4, wagePerHour = 20;
		 int totalHours = 100, totalDays = 20, passedHours = 0, passedDays = 0;
		 
		 while(passedHours <= totalHours && passedDays <= totalDays){
			 int isPresent = (int)(Math.floor(Math.random() * 10)% 3);
			 if(isPresent == 1){
				 wageDay = fullTimeHours * wagePerHour;
				 passedHours = passedHours + fullTimeHours;
			 }
			 else if(isPresent == 2){
				 wageDay = partTimeHours * wagePerHour;
				 passedHours = passedHours + partTimeHours;
			 }
			 wage = wageDay + wage;
		 }
		 
		 System.out.print("Employee wage is "+wage);
			 
	 }

	

}


