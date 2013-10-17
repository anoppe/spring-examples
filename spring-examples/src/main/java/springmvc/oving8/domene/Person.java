package springmvc.oving8.domene;

import javax.validation.constraints.*;

/**
 *
 * @author jim-espengundersen
 */
public class Person {
	
	@Size(min=1)
	private String firstName;
	private String middleName;
	@Size(min=1)
	private String lastName;
	@Min(1)
	@Max(100)
	private int age;
	private Gender gender;
	@Size(min=1)
	private String email;
	@Digits(fraction = 0, integer = 4)
	private int postalCode;
	private Hobby hobby;

	public Person() {
	}

	public Person(String lastName, int age, String firstName, String middleName, String email, int postalCode, Gender gender, Hobby hobby) {
		this.lastName = lastName;
		this.age = age;
		this.middleName = middleName;
		this.email = email;
		this.postalCode = postalCode;
		this.firstName = firstName;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	public enum Hobby {
		Ballsport, Strikking, Data, Ridning, Musikk, Friluftsliv
	} 
	
	public enum Gender {
		Mann, Kvinne
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Hobby getHobby() {
		return hobby;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}
}