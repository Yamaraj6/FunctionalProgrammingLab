import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rent {
	private Resource resource;
	private Date rent_date;
	private Date return_date;
	
	public Rent(Resource resource, Date rentDate)
	{
		this.resource = resource;
		this.rent_date = rentDate;
	}
	
	public Resource GetResource()
	{
		return resource;
	}
	
	public boolean IsRentedByReader()
	{
		return return_date==null;
	}
	
	public void ReturnResource()
	{
		return_date = new Date();
	}
	
	@Override
	public String toString() 
	{
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		String rentDate = "";
		String returnDate = "";
		try {
			rentDate = format.format(rent_date);
			returnDate = format.format(return_date);
		}catch (Exception e) {returnDate = "";}
		return String.format("%s\n%-10s, %-10s", resource.toString(), rentDate, returnDate);
	}
}