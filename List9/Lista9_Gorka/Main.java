import java.util.LinkedList;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main 
{
	public static void main(String[] args) throws ParseException 
	{
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		
		Library l = new Library();
		List<Resource> res = new LinkedList<Resource>();
		List<Reader> read = new LinkedList<Reader>();
		for(int i = 0 ;i<10;i++)
		{
			if(i<5)
			{
				res.add(new Book(i, "Book"+i, "Author"+i));
				read.add(new Reader(i, "FirstName"+i, "LastName"+i));
			}
			else
			{
				res.add(new Disc(i, "Disc"+i, "Preformer"+i));
			}
				
		}
		Book b11 = new Book(1, "Book5", "Author5");
		Disc d11 = new Disc(1, "Disc5", "Preformer5");
		Reader r11 = new Reader(1, "FirstName5", "LastName5");
		ReaderPremium rp1 = new ReaderPremium(6, "FirstName6", "LastName6", format.parse("22.01.2018"));
		ReaderPremium rp2 = new ReaderPremium(7, "FirstName7", "LastName7", format.parse("22.01.2016"));
		ReaderPremium rp3 = new ReaderPremium(8, "FirstName8", "LastName8", format.parse("14.12.2017"));
		ReaderPremium rp4 = new ReaderPremium(9, "FirstName9", "LastName9", format.parse("22.12.2017"));

		for(Resource r : res)
			System.out.println(l.AddResource(r));
		for(Reader r : read)
			System.out.println(l.AddReader(r));

		System.out.println(l.AddResource(b11));
		System.out.println(l.AddResource(d11));
		System.out.println(l.AddReader(r11));
		
		System.out.println(l.AddReader(rp1));
		System.out.println(l.AddReader(rp2));
		System.out.println(l.AddReader(rp3));
		System.out.println(l.AddReader(rp4));	
		System.out.println();
		System.out.println(l.Rent(1, 1));	
		System.out.println(l.Rent(1, 1));	
		System.out.println(l.Rent(3, 1));	
		System.out.println(l.Rent(4, 1));	
		System.out.println(l.Rent(2, 1));	
		System.out.println(l.Rent(4, 2));	
		System.out.println(l.Rent(6, 2));	
		System.out.println(l.Rent(7, 7));	
		System.out.println(l.Rent(8, 7));	

		System.out.println(l.Return(4, 1));	
		
		System.out.println(l.FindResourceByID(3));
		System.out.println(l.IsResourceRented(3));
		System.out.println(l.IsResourceRented(2));
		System.out.println(l.IsResourceRented(7));
		System.out.println(l.IsResourceRented(8));
		System.out.println();
		System.out.println(l.Rent(7, 9));	
		System.out.println(l.Rent(8, 9));	
		System.out.println(l.IsResourceRented(7));
		System.out.println(l.IsResourceRented(8));
		System.out.println(l.Return(7, 9));	
		System.out.println(l.IsResourceRented(7));
		System.out.println(l.ShowReaderHistory(1));
		
	}
}
