import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Reader 
{
	protected int library_card_id;
	protected String first_name;
	protected String last_name;
	protected List<Rent> history;
	
	public Reader(int cardID, String firstName, String lastName)
	{
		library_card_id = cardID;
		first_name = firstName;
		last_name = lastName;
		history = new LinkedList<Rent>();
	}
	
	public int GetCardID()
	{
		return library_card_id;
	}
	
	public void RentResource(Resource resource)
	{
		Rent r = new Rent(resource, new Date());
		history.add(r);
	}
	
	public boolean ReturnResource(Resource resource)
	{
		for(Rent rent : history)
		{
			if(resource.GetID() == rent.GetResource().GetID() && rent.IsRentedByReader())
			{
				rent.ReturnResource();
				return true;
			}			
		}
		return false;
	}
	
	public boolean HasResource(Resource resource)
	{
		for(Rent rent : history)
			if(resource.GetID() == rent.GetResource().GetID() && rent.IsRentedByReader())
				return true;
			return false;
	}
	
	@Override
	public String toString() 
	{
		return String.format("%-5d %-25s %-25s", library_card_id, first_name, last_name);
	}

	public String historyToString()
	{
		String temp="";
		for(Rent rent : history)
		{
			temp += (rent.toString() + "\n");
		}
		return temp;
	}
}
