def przeksztalc(list:List[Int]):Int=
{
  def przeksztalc_h(list1:List[Int], len:Int):Int=
  (list1)match
  {
    case(h::t) => (h*Math.pow(8, len-1)).toInt + przeksztalc_h(t, len-1)
    case _ => 0
  }
  przeksztalc_h(list, list.length)
}

TESTY:
przeksztalc(1::4::4::Nil)
przeksztalc(1::1::1::Nil)
przeksztalc(1::1::1::7::4::3::2::Nil)
