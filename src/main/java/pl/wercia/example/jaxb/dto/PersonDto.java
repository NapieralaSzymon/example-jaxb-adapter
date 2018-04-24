package pl.wercia.example.jaxb.dto;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import pl.wercia.example.jaxb.adapter.DateAdapter;

public class PersonDto {

	private String firstName;

	private String lastName;

	@XmlJavaTypeAdapter(value = DateAdapter.class)
	private Date birthday;

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
