public class Osoba 
{
    protected String imie;
    protected String nazwisko;

    public Osoba(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    public String drukuj()
    {
        String druk = "/OSOBA/";
        druk+="\n";
        druk+="Imie: "+imie;
        druk+="\n";
        druk+="Nazwisko: "+nazwisko;
        return druk;
    }
}
