def liczbnieparzystych(list:List[Int]):Int=
  if(list==Nil) 0
  else if (list.head%2==1) 1+liczbnieparzystych(list.tail)
  else liczbnieparzystych(list.tail)
  
def liczbnieparzystych_tail(list:List[Int]):Int=
{
  def liczbnieparzystych_h(li:List[Int], n:Int):Int=
  {
    if(li==Nil) n
    else if (li.head%2==1) liczbnieparzystych_h(li.tail, n+1)
    else liczbnieparzystych_h(li.tail, n)
  }
  liczbnieparzystych_h(list, 0);
}

  TESTY:
  liczbnieparzystych(1::2::3::4::5::Nil)
  liczbnieparzystych(1::1::3::11::5::Nil)
  liczbnieparzystych(List.range(1,15))
  liczbnieparzystych(5::4::3::2::Nil)
  liczbnieparzystych_tail(1::2::3::4::5::Nil)
  liczbnieparzystych_tail(1::1::3::11::5::Nil)
  liczbnieparzystych_tail(List.range(1,15))
  liczbnieparzystych_tail(5::4::3::2::Nil)