package day2.xmlparsing;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserExample {
	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		DefaultHandler handler = new DefaultHandler() {

			@Override
			public void startDocument() throws SAXException {
				super.startDocument();
				System.out.println("DOCUMENT STARTED");
			}

			@Override
			public void endDocument() throws SAXException {
				super.endDocument();
				System.out.println("DOCUMENT ENDED");
			}

			@Override
			public void startElement(String uri, String localName,
					String qName, Attributes attributes) throws SAXException {
				super.startElement(uri, localName, qName, attributes);
				System.out.println("ELEMENT STARTED - " + qName);
			}

			@Override
			public void endElement(String uri, String localName, String qName)
					throws SAXException {
				super.endElement(uri, localName, qName);
				System.out.println("ELEMENT ENDED - " + qName);
			}

			@Override
			public void characters(char[] ch, int start, int length)
					throws SAXException {
				super.characters(ch, start, length);
				System.out.println("TEXT VALUE - "
						+ new String(ch).substring(start, start + length));
			}

		};
		saxParser.parse(new File("data/company.xml"), handler);
	}
}
