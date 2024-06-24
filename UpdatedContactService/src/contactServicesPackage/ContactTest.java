package contactServicesPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

	//Tests that a base contact is created with all of the parameters needed.
	@Test
	public void ContactCreationTest()
	{
		Contact contact = new Contact("01", "Sally", "Williams", "5555555555", "123 Main");
		
		assertNotNull(contact);
		assertEquals("01", contact.GetContactID());
		assertEquals("Sally", contact.GetFirstName());
		assertEquals("Williams", contact.GetLastName());
		assertEquals("5555555555", contact.GetContactPhoneNumber());
		assertEquals("123 Main", contact.GetContactAddress());
	}	
	
	//Checks that the contact ID isn't longer than 10 characters and throws an exception if so.
	@Test
	public void ContactIDIsLongerThan10()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Sally", "Williams", "5555555555", 
					"123 Main");
		});
	}
	
	//Checks if the first name is longer than 10 character and throws an exception if so.
	@Test
	public void FirstNameIsLongerThan10()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Fer-Doirich", "Williams", "5555555555", 
					"123 Main");
		});
	}
	
	//Checks that the last name is not over 10 characters and throws an exception if so.
	@Test
	public void LastNameIsLongerThan10()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Sally", "Fer-Doirich", "5555555555", 
					"123 Main");
		});
	}
	
	//Checks that the phone number is exactly 10 characters and throws an exception if so.
	@Test
	public void PhoneNumberIsNot10()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Sally", "Williams", "555", "123 Main");
		});
	}
	
	//Checks that the address is not longer than 30 characters and throws an exception if so.
	@Test
	public void AddressIsLongerThan30()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Sally", "Williams", "5555555555", 
					"123 Main of the city of insanity and craziness");
		});
	}
	
	//Checks that none of the fields are null.
	@Test
	public void CheckForNullFields()
	{
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Sally", "Williams", "5555555555", "123 Main");
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", null, "Williams", "5555555555", "123 Main");
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Sally", null, "5555555555", "123 Main");
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01", "Sally", "Williams", null, "123 Main");
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Sally", "Williams", "5555555555", null);
		});
	}
}
