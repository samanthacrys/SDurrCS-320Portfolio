package contactServicesPackage;

public class Contact {

	private final String contactID;
	private String firstName;
	private String lastName;
	private String contactPhoneNumber;
	private String contactAddress;
	
	//Constructor that instantiates the contact variables.
	public Contact(String contactID, String firstName, String lastName,
			String contactPhoneNumber, String contactAddress)
	{
		if(contactID == null || contactID.length() > 10)
		{
			throw new IllegalArgumentException("Contact ID cannot be empty and no more than"
					+ " 10 characters in length.");
		}
		
		if(firstName == null || firstName.length() > 10)
		{
			throw new IllegalArgumentException("First name cannot be empty and no more than"
					+ " 10 characters in length.");
		}
		
		if(lastName == null || lastName.length() > 10)
		{
			throw new IllegalArgumentException("Last name cannot be empty and no more than"
					+ " 10 characters in length.");
		}
		
		if(contactPhoneNumber == null || contactPhoneNumber.length() != 10)
		{
			throw new IllegalArgumentException("Phone number cannot be empty and it must be"
					+ " exactly 10 characters in length.");
		}
		
		if(contactAddress == null || contactAddress.length() > 30)
		{
			throw new IllegalArgumentException("Address cannot be empty and no longer than"
					+ " 30 characters in length.");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactPhoneNumber = contactPhoneNumber;
		this.contactAddress = contactAddress;
	}

	//A getter that returns the contactID.
	public String GetContactID() {

		return contactID;
		
	}
	
	//A getter that gets the first name of the contact.
	public String GetFirstName() {
		
		return firstName;
		
	}
	
	//A setter that sets the first name to firstName.
	public void SetFirstName(String firstName) {

		if(firstName == null || firstName.length() > 10)
		{
			throw new IllegalArgumentException("First name cannot be empty and no more than"
					+ " 10 characters in length.");
		}
		
		this.firstName = firstName;
		
	}
	
	//A getter that gets the last name.
	public String GetLastName() {
		
		return lastName;
		
	}
	
	//A setter that sets the last name.
	public void SetLastName(String lastName) {
		
		if(lastName == null || lastName.length() > 10)
		{
			throw new IllegalArgumentException("Last name cannot be empty and no more than"
					+ " 10 characters in length.");
		}
		
		this.lastName = lastName;
		
	}

	//A getter that gets the contact's phone number.
	public String GetContactPhoneNumber() {
		
		return contactPhoneNumber;
	}
	
	//A setter that sets the contact's phone number.
	public void SetContactPhoneNumber(String contactPhoneNumber) {
		
		if(contactPhoneNumber == null || contactPhoneNumber.length() != 10)
		{
			throw new IllegalArgumentException("Phone number cannot be empty and it must be"
					+ " exactly 10 characters in length.");
		}
		
		this.contactPhoneNumber = contactPhoneNumber;
		
	}

	//A getter that gets the contact's address.
	public String GetContactAddress() {
		
		return contactAddress;
	}
	
	//A Setter that sets the contact's address.
	public void SetContactAddress(String contactAddress) {
		
		if(contactAddress == null || contactAddress.length() > 30)
		{
			throw new IllegalArgumentException("Address cannot be empty and no longer than"
					+ " 30 characters in length.");
		}
		
		this.contactAddress = contactAddress;
		
	}
	
	
}
