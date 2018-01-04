
public class Book extends Resource{
	private String title;
	private String author;
	
	public Book(int id, String title, String author)
	{
		this.id = id;
		this.title = title;
		this.author =author;
	}

	public String toString()
	{
		return String.format("%-5d %-20s %-20s", (id), (title), author);
	}
}
