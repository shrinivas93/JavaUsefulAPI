package day2.xmlparsing;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomBuilderExample {
	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory
				.newDocumentBuilder();
		Document document = documentBuilder
				.parse(new File("data/company.xml"));
		System.out.println("ROOT ELEMENT : "
				+ document.getDocumentElement().getNodeName());
		NodeList childNodes = document.getElementsByTagName("staff");
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node node = childNodes.item(i);
			System.out.println("NODE : " + node.getNodeName());
			NamedNodeMap attributes = node.getAttributes();
			for (int j = 0; j < attributes.getLength(); j++) {
				Node item = attributes.item(j);
				System.out.println(item.getNodeName() + " : "
						+ item.getNodeValue());
			}
			NodeList childs = node.getChildNodes();
			for (int j = 0; j < childs.getLength(); j++) {
				Node item = childs.item(j);
				System.out.println(item.getNodeName() + " - "
						+ item.getTextContent());
			}
		}
	}
}
