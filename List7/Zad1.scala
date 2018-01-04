def lpodziel(list:Stream[Int]):(Stream[Int], Stream[Int])=
{
  def podziel(list1:Stream[Int], list2:Stream[Int], list:Stream[Int]): (Stream[Int], Stream[Int])=
  (list) match
  {
    case(Stream.Empty)=>(list1, list2)
    case(h#::t)=> 
      if(h%2==0)
        podziel(list1, list2 #::: Stream(h), t)
        else
        podziel(list1 #::: Stream(h), list2, t)
  } 
  podziel(Stream.Empty, Stream.Empty, list)
}

TESTY:
(lpodziel(Stream(1,3,5,6,8,12))) match{
  case (a, b)=> (a force, b force)
}
(lpodziel(Stream(5,6,3,2,1))) match{
  case (a, b)=> (a force, b force)
}
(lpodziel(Stream(6,8,12))) match{
  case (a, b)=> (a force, b force)
}
