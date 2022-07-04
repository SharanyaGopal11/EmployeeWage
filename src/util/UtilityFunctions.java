package util;

public class UtilityFunctions {
	public String isPresent() {
		 double isPresent = Math.random();
		 if (isPresent > 0.5 )
			 return "present";          // if isPresent is greater than 0.5 then the employee is present
		 else
			 return "absent";          // if isPresent is less than 0.5 then the employee is absent
	 }


}


