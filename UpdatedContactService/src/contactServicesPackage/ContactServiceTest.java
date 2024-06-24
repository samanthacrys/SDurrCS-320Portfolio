package contactServicesPackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;


public class ContactServiceTest {
	
	private ContactService contactService;
	
	//Starts a new contact service before everything to keep from having to do so in every
	//test.
	@BeforeEach
	public void SetUp()
	{
		contactService = new ContactService();
	}
	
	//Tests that a new contact is added to the system.
	@Test
	public void AddContactTest()
	{
		Contact contact = new Contact("01", "Sally", "Williams", "5555555555", "123 Main");
		
		assertTrue(contactService.AddContact(contact));
	}
	
	//Tests that deletes the contact from the system.
	@Test
	public void DeleteContactTest()
	{
		Contact contact = new Contact("01", "Sally", "Williams", "5555555555", "123 Main");
		
		contactService.AddContact(contact);
		assertTrue(contactService.DeleteContact("01"));
	}
	
	//Verifies that the contact is deleted.
	@Test
	public void VerifyContactDeletedTest()
	{
		assertFalse(contactService.DeleteContact("01"));
	}
	
	//Updates the first name of the user and ensures that it has been updated.
	@Test
	public void UpdateFirstNameTest()
	{
		Contact contact = new Contact("01", "Sally", "Williams", "5555555555", "123 Main");
		
		contactService.AddContact(contact);
		
		contactService.UpdateFirstName("01", "Jamie");
		
		assertEquals("Jamie", contactService.GetContact("01").GetFirstName());
	}
	
	//Tests that the last name is updated.
	@Test
	public void UpdateLastNameTest()
	{
		Contact contact = new Contact("01", "Sally", "Williams", "5555555555", "123 Main");

		contactService.AddContact(contact);

		contactService.UpdateLastName("01", "Michaels");
		
		assertEquals("Michaels", contactService.GetContact("01").GetLastName());
	}
	
	//Tests that the contact number is updated.
	@Test
	public void UpdateContactPhoneNumberTest()
	{
		Contact contact = new Contact("01", "Sally", "Williams", "5555555555", "123 Main");

		contactService.AddContact(contact);
		
		contactService.UpdateContactPhoneNumber("01", "5551234568");
		
		assertEquals("5551234568", contactService.GetContact("01").GetContactPhoneNumber());

	}
	
	//Tests that the address for the contact is updated.
	@Test
	public void UpdateContactAddressTest()
	{
		Contact contact = new Contact("01", "Sally", "Williams", "5555555555", "123 Main");

		contactService.AddContact(contact);
		
		contactService.UpdateContactAddress("01", "457 W Adams Ave");
		
		assertEquals("457 W Adams Ave", contactService.GetContact("01").GetContactAddress());

	}
	
	
	//Verifies that it is able to get the contact information.
	@Test
	public void GetContactTest()
	{
		Contact contact = new Contact("02", "James", "Winters", "5555551234", "524 Lake St");
		
		contactService.AddContact(contact);
		
		Contact contactRetrieved = contactService.GetContact("02");
		
		assertEquals(contact, contactRetrieved);
	}
	
}
