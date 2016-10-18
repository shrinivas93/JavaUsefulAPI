package day2.xmlbinding;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employees {
	private List<Employee> employees;

	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(List<Employee> employees) {
		super();
		this.employees = employees;
	}

	@XmlElement
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Employees [employees=" + employees + "]";
	}

}
