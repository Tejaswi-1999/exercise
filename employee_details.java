package deloitte;

import java.util.Arrays;



public class employee_details {

	public static void main(String[] args) {
		employee []employees=new employee[3];
		employees[0]=new employee(235,"Mohit","IT_Dept");
		employees[1]=new employee(345,"Praveen","Audit");
		employees[2]=new employee(568,"Anil","Taxing");
		
		
	    Arrays.sort(employees);
	    for(int i=0;i<employees.length;i++)
	    	System.out.println(employees[i]);
		
		
	}

}
