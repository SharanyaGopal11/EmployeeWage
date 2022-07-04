package util;

public class UtilityFunctions {
	public void isPresent() {
		 double isPresent = Math.random();
		 int wage =0;
		 if (isPresent > 0.5 ){
			 wage = 8 * 20;
			 System.out.println("Employee is present and his wage is "+wage); // Employee is present if the value is greater than 0.5
		 }
		 else
			 System.out.println("Employee is absent and his wage is 0");   // Employee is absent if the value is less than 0.5
	 }

	

}


