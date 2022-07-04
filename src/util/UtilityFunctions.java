package util;

public class UtilityFunctions {
	public void isPresent() {
		int isPresent = (int)(Math.floor(Math.random() * 10)% 3);
		 int wage =0;
		 int fullTime = 1, partTime = 2 , absent = 0;
		 int fullTimeHours = 8, partTimeHours = 4, wagePerHour = 20;
		 
		 
		 if (isPresent == fullTime ){
				/**
				 Employee is full time present if the value is 1
				 and his wage is calculated accordingly
				 */
			 wage = fullTimeHours * wagePerHour;
			 System.out.println("Employee is present and his wage is "+wage); 
		 }
		 else if (isPresent == partTime ){
				/**
			 Employee is part time present if the value is 2
			 and his wage is calculated accordingly
			 */
			 wage = partTimeHours * wagePerHour;
			 System.out.println("Employee is part time and his wage is "+wage);   // Employee is absent if the value is less than 0.5
		 }
		 else if (isPresent == absent ){
				/**
			 Employee is absent if the value is 0
			 and his wage is 0
			 */
			 System.out.println("Employee is absent and his wage is "+wage);
		 }
	 }

	

}


