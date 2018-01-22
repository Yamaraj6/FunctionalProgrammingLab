public class Main 
{
	   public static void main(String args[]) 
	   {
		   System.out.println("START");
		   final int miejsca = 3, iloscStatkow = 5, iloscHolownikowWPorcie = 10;
	       Port port = new Port(miejsca, iloscHolownikowWPorcie);   
	       Statek[] statki = new Statek[iloscStatkow];
	       for (int i=1; i<iloscStatkow; i++) 
	       {
	    	   statki[i] = new Statek(i, port, i+"");
	    	   statki[i].start();
	       }  
	   }
}