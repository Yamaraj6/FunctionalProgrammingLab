import java.util.Collection;
import java.lang.Number;

public class DrukujLiczby
{
	public static <T extends Number> void drukuj(Collection<T> col)
	{
		for(T number : col)
		{
			System.out.println(number.doubleValue());
		}
	}
}