// Abstract base class Employee.

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private LocalDateTime joinDate;
	private LocalDateTime now = LocalDateTime.now();
	private DateTimeFormatter format = DateTimeFormat.forPattern("yyyy,mm,dd,HH,mm"); 

	// constructor
	public Employee(String first, String last, String date) throws InvalidDateException {
		firstName = first;
		lastName = last;
//		joinDate = LocalDateTime.parse(date);
		if(!checkDate(joinDate)) {
			throw new InvalidDateException();  // If checkDate does not return true throw exception
		}
//		System.out.println(joinDate.toString());
	}

	// get first name
	public String getFirstName() {
		return firstName;
	}

	// get last name
	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return firstName + ' ' + lastName;
	}
	
	public boolean checkDate(LocalDateTime date) {
//		if(joinDate.toDate().compareTo((now.toDate()) > 0) 
//			return false;
//		else if(joinDate.getYear() < 1990) 
//			return false;
//		else if(joinDate.getMonthOfYear() > 12)
//			return false;
//		else if()
		return true;
	}

	public abstract double earnings();
}
