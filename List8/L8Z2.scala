def duplicate(list1:List[Int], list2:List[Int]):List[Int]=
{
  def duplicate_h(el:Int, count:Int, list1:List[Int],
      list2:List[Int], list:List[Int]):List[Int]=
  (el, list1, list2)match
  {
    case(_, h1::t1, h2::t2)=>
      if(count<=0)
        duplicate_h(h1, h2, t1, t2, list)
      else
        duplicate_h(el, count-1, list1, list2, list:+el)
    case _ =>
      if(count<=0)
        list
      else
        duplicate_h(el, count-1, list1, list2, list:+el)
        
  }
  if(list1!=Nil && list2 != Nil)
    duplicate_h(list1.head, list2.head, list1.tail, list2.tail, Nil)
  else
    Nil
}

TESTY:
duplicate(1::2::3::4::9::11::Nil, 4::3::2::2::0::Nil)
duplicate(1::2::3::4::9::11::Nil, 0::Nil)
duplicate(Nil, Nil)