public class Programista extends Pracownik 
{
    protected String nick;

    public Programista(String imie,String nazwisko,int id, String nick)
    {
        super(imie, nazwisko, id);
        this.nick=nick;
    }

    @Override
    public String drukuj()
    {
        String druk = "/PROGRAMISTA/";
        druk+="\n";
        druk+="Imie: "+imie;
        druk+="\n";
        druk+="Nazwisko: "+nazwisko;
        druk+="\n";
        druk+="Id: "+String.valueOf(id);
        druk+="\n";
        druk+="Nick: : "+nick;
        return druk;
    }
}