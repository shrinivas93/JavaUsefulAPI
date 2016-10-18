package day2.xmlbinding;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Employee e1 = new Employee(1, "Shrinivas", 35000);
		Employee e2 = new Employee(2, "Nikita", 30000);
		Employee e3 = new Employee(3, "Mohini", 47500);
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		Employees employees = new Employees(employeeList);
		File file = new File("data/employee.xml");
		marshaller.marshal(employees, file);
	}
}
