package contactServicesPackage;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

	//Creates a new hash map that works with contacts.
	private final Map<String, Contact> contacts;
	
	//Constructor that starts the hash map.
	public ContactService() 
	{
		contacts = new HashMap<>();
	}
	
	//Add's a new contact ID to the contacts map.
	public boolean AddContact(Contact contact)
	{
		if(contacts.containsKey(contact.GetContactID()))
		{
			throw new IllegalArgumentException("Contact ID already exists.");
		}

		contacts.put(contact.GetContactID(), contact);
		
		return true;
	}
	
	//Removes a contact by removing the contact ID.
	public boolean DeleteContact(String contactID)
	{
		if(contacts.containsKey(contactID))
		{
			contacts.remove(contactID);
			return true;
		}
		
		return false;
	}
	
	//Updates the first name of the contact ID that's associated with that area.
	public void UpdateFirstName(String contactID, String updatedFirstName)
	{
		Contact contact = GetContact(contactID);
		
		contact.SetFirstName(updatedFirstName);
	}
	
	//Updates the last name of the entered Contact ID.
	public void UpdateLastName(String contactID, String updatedLastName)
	{
		Contact contact = GetContact(contactID);
		
		contact.SetLastName(updatedLastName);
	}
	
	//Updates the Contact Phone Number associated with the entered contact ID.
	public void UpdateContactPhoneNumber(String contactID, String UpdatedContactPhoneNumber)
	{
		Contact contact = GetContact(contactID);
		
		contact.SetContactPhoneNumber(UpdatedContactPhoneNumber);
	}
	
	//Updates the contact address for the entered contact ID.
	public void UpdateContactAddress(String contactID, String UpdatedContactAddress)
	{
		
		Contact contact = contacts.get(contactID);
		
		if(contact != null)
		{
			contact.SetContactAddress(UpdatedContactAddress);
		}
	}
	
	//Gets the contact.
	public Contact GetContact(String contactID)
	{
		Contact contact = contacts.get(contactID);
		
		if(contact == null)
		{
			throw new IllegalArgumentException("Contact ID was not found.");
		}
		
		return contact;
	}
	
}
