trait Debug
{
  def debugVars =
  {
   val fields = getClass.getDeclaredFields
   
   for(i <- 0 to fields.length-1)
   {
     fields(i).setAccessible(true);
     println("Pole: " + fields(i).getName+" => " + fields(i).getType+ ", " + fields(i).get(this))
   }
  }
}

class Point(xv: Int, yv: Int) extends Debug 
{
  var x: Int = xv
  var y: Int = yv
  var a: String = "test"
}

object Test extends App
{
  var p : Point = new Point(2,3);
  p.debugVars;
}