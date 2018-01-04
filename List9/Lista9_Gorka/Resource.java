
public abstract class Resource 
{
	protected int id;
	protected boolean is_rented;
	
	public int GetID()
	{
		return id;
	}
	
	public boolean IsRented()
	{
		return is_rented;
	}
	
	public boolean Rent()
	{
		if(!is_rented)
		{
			is_rented = true;
			return true;
		}
		return false;
	}
	
	public boolean Return()
	{
		if(is_rented)
		{
			is_rented = false;
			return true;
		}
		return false;
	}
	
	@Override
	public abstract String toString();
}