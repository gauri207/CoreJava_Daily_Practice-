package Strings;
//encapsulation demo
class Employee{
	private int empId;//data hiding
	public void setEmpId(int id) {
		empId=id;
	}
	public int getEmpId() {
		return empId;
	}
	
}
public class Encaplsulation {
	public static void main(String[] args) {
		Employee employee=new Employee();
//		System.out.println(employee.empId=10);
		employee.setEmpId(101);
		System.out.println("Employee id is:"+employee.getEmpId());
	}
}
