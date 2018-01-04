import java.util.LinkedList;
import java.util.List;

public class Library 
{
	private List<Reader> readers;
	private List<Resource> resources;
	
	public Library()
	{
		readers = new LinkedList<Reader>();
		resources = new LinkedList<Resource>(); 
	}

	public boolean AddReader(Reader r)
	{
		for(Reader reader : readers)
			if(reader.GetCardID() == r.GetCardID())
				return false;
		readers.add(r);
		return true;
	}
	
	public boolean RemoveReader(int cardID)
	{
		for(Reader reader : readers)
			if(reader.GetCardID()==cardID)
			{	
				readers.remove(reader);
				return true;
			}
		return false;
	}
	
	public boolean AddResource(Resource r)
	{
		for(Resource res : resources)
			if(res.GetID() == r.GetID())
				return false;
		resources.add(r);
		return true;
	}
	
	public boolean RemoveResource(int resourceID)
	{
		for(Resource r : resources)
			if(r.GetID()==resourceID)
			{
				resources.remove(r);
				return true;
			}
		return false;
	}

	public boolean Rent(int resourceID, int cardID)
	{
		for(Reader reader : readers)
			if(reader.GetCardID()==cardID)
				for(Resource resource : resources)
					if(resource.GetID() == resourceID)
					{
						if((resource.getClass() == Disc.class && reader.getClass() == ReaderPremium.class
								&& ((ReaderPremium)reader).IsPremiumPaid()) 
								||resource.getClass() == Book.class)
						{
							if(resource.Rent())
							{
								reader.RentResource(resource);
							}
							else
							{
								return false;
							}
							return true;
						}
					}
		return false;
	}	

	public boolean Return(int resourceID, int cardID)
	{
		for(Reader reader : readers)
			if(reader.GetCardID()==cardID)
				for(Resource resource : resources)
					if(resource.GetID() == resourceID)
					{
						if(resource.Return())
						{
							reader.ReturnResource(resource);
						}
						else
						{
							return false;
						}
						return true;
					}
		return false;
	}	
	
	public String FindResourceByID(int id)
	{
		for(Resource r : resources)
		{
			if(r.GetID() == id)
				return r.toString();
		}
		return "Resource doesn't exist!";
	}
	
	public String IsResourceRented(int id)
	{
		for(Resource resource : resources)
		{
			if(resource.GetID() == id)
				if(resource.IsRented())
				{
					for(Reader reader : readers)
						if(reader.HasResource(resource))
							return "Resource: "+ resource + "\n" + "is rented by: " + reader;
				}
				else
					return "Resource is not rented!";
		}
		return "Resource doesn't exist!";
	}
	
	public String ShowReaderHistory(int cardID)
	{
		for(Reader reader : readers)
			if(reader.GetCardID() == cardID)
				return reader.historyToString();
		return "Reader doesn't exist!";
	}
}