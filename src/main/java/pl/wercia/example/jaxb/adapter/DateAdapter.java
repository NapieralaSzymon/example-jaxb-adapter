package pl.wercia.example.jaxb.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	private static final String DATE_FORMAT = "dd.MM.yyyy";

	@Override
	public Date unmarshal(String value) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		return dateFormat.parse(value);
	}

	@Override
	public String marshal(Date value) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		return dateFormat.format(value);
	}

}
