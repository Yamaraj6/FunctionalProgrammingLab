trait Debug
{
  def debugName= println("Klasa: " + getClass.getSimpleName)
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
  p.debugName;
}