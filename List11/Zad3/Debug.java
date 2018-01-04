import java.lang.reflect.Field;
 
public class Debug 
{
    public void fields(Object object)
    {
        Field [] fields=object.getClass().getDeclaredFields();
        for(int i=0;i<fields.length;i++)
        {
			Object value = null;
        	fields[i].setAccessible(true);
        	try {
				value = fields[i].get(object);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Pole: " + fields[i].getName() + "=>" +fields[i].getType() + ", "+ value.toString());
        }
    }
   
    public static void main(String[] args)
    {
        Point p = new Point(3,4);
        Debug d= new Debug();
        d.fields(p);
    }
}