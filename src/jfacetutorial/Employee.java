package jfacetutorial;

public class Employee {

	  private String empNo;
	  private String firstName;
	  private String lastName;

	  public Employee(String empNo, String firstName, String lastName) {
	      this.empNo = empNo;
	      this.firstName = firstName;
	      this.lastName = lastName;
	  }

	  public String getEmpNo() {
	      return empNo;
	  }

	  public void setEmpNo(String empNo) {
	      this.empNo = empNo;
	  }

	  public String getFirstName() {
	      return firstName;
	  }

	  public void setFirstName(String firstName) {
	      this.firstName = firstName;
	  }

	  public String getLastName() {
	      return lastName;
	  }

	  public void setLastName(String lastName) {
	      this.lastName = lastName;
	  }
	}