import java.util.Date;

public class ReaderPremium extends Reader
{
	private Date premium_is_paid_date;
	
	public ReaderPremium(int cardID, String firstName, String lastName, Date premiumPaid)
	{
		super(cardID, firstName, lastName);
		premium_is_paid_date = premiumPaid;
	}
	
	public boolean IsPremiumPaid()
	{
		return premium_is_paid_date.after(new Date());
	}
	
	@Override
	public String toString() 
	{
		return String.format("%-5d %-25s %-25s PREMIUM USER", library_card_id, first_name, last_name);
	}
}