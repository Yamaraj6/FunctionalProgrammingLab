public class Czytelnik {
	public enum Rodzaj_Konta{
		ZWYKLE(0), PREMIUM(1);
		
		private int rodzaj;
		
		Rodzaj_Konta(int rodzaj)
		{
			this.rodzaj=rodzaj;
		}
	}
	
	private Rodzaj_Konta rodzaj;
	private String imie;
	private String nazwisko;
	private int numer_karty_bibliotecznej;
	
	Czytelnik(String Imie, String Nazwisko, 
			int NumerKarty)
	{
		imie = Imie;
		nazwisko = Nazwisko;
		numer_karty_bibliotecznej = NumerKarty;
		rodzaj = Rodzaj_Konta.PREMIUM;
	}
	
	public String toString()
	{
		return imie+":"+nazwisko
				+":"+numer_karty_bibliotecznej;
	}
	
}
