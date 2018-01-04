
public class Disc extends Resource{
	private String album_name;
	private String performer;	
	
	public Disc(int id, String albumName, String performer)
	{
		this.id = id;
		this.album_name = albumName;
		this.performer = performer;
	}
	
	public String toString()
	{
		return String.format("%-5d %-20s %-20s", id, album_name, performer);
	}
}
