
final class Ulamek(l: Int, m: Int) 
{
  require(m != 0)
  
  private val n = nwd(l, m)
  
  private val licznik: Int = licz(l,m) / n
  private val mianownik: Int = mian(l,m) / n

  private def nwd(a: Int, b: Int) : Int =
		if (b == 0) a else nwd(b, a % b)

	def mian(l:Int, m:Int):Int=
	{
		  if(m<0) -m
		  m
	}
  
  def licz(l:Int, m:Int):Int=
	{
		  if(m<0) -l
		  l
	}

  def dodaj(b:Ulamek):Ulamek=
  {
		  val l1 = licznik*b.mianownik
		  val l2 = b.licznik*mianownik
		  new Ulamek(l1+l2, mianownik*b.mianownik)  
  }
  
	def odejmij(b:Ulamek):Ulamek=
  {
		  val l1 = licznik*b.mianownik
		  val l2 = b.licznik*mianownik
		  new Ulamek(l1-l2, mianownik*b.mianownik)  
  }
	
	def pomnoz(b:Ulamek):Ulamek=
  {
		  new Ulamek(licznik*b.licznik, mianownik*b.mianownik)  
  }
		
	def podziel(b:Ulamek):Ulamek=
  {
		  new Ulamek(licznik*b.mianownik, mianownik*b.licznik)  
  }
	
  def odwroc():Ulamek=
  {
		  new Ulamek(mianownik, licznik)  
  }
	
	def rowny(b:Ulamek):Boolean=
	{
	  return (licznik == b.licznik && mianownik == b.mianownik)
	}
		
	override def toString =
		licznik + "/" + mianownik
}