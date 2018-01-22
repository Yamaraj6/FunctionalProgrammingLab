public class Pracownik extends Osoba 
{
    protected int id;

    public Pracownik(String imie,String nazwisko,int id)
    {
        super(imie, nazwisko);
        this.id=id;
    }

    @Override
    public String drukuj()
    {
        String druk = "/PRACOWNIK/";
        druk+="\n";
        druk+="Imie: "+imie;
        druk+="\n";
        druk+="Nazwisko: "+nazwisko;
        druk+="\n";
        druk+="Id: "+String.valueOf(id);
        return druk;
    }
}
