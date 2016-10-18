package day2.xmlbinding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshalling {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		File file = new File("data/employee.xml");
		Employees employees = (Employees) unmarshaller.unmarshal(file);
		System.out.println(employees);
	}
}
