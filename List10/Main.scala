object Main 
{
  def main (args: Array[String])=
  {
    val ulamek1 = new Ulamek(99, 9900)
    val ulamek2 = new Ulamek(99, 9900)
    println(ulamek1)
    val ulamek3 = ulamek1.dodaj(ulamek2)
    println(ulamek3)
    val ulamek4 = ulamek1.odejmij(ulamek2)
    println(ulamek4)
    val ulamek5 = ulamek1.pomnoz(ulamek2)
    println(ulamek5)
    val ulamek6 = ulamek1.podziel(ulamek2)
    println(ulamek6)
    val ulamek7 = ulamek1.rowny(ulamek2)
    println(ulamek7)
    val ulamek8 = ulamek1.odwroc()
    println(ulamek8)
    
  }
}