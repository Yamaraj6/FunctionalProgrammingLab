def koduj[A](list:List[A]) =
{ def koduj_h[A](list1:List[(Int, A)], list2:List[A]):List[(Int, A)] =
    (list1,list2)match
    {
      case (_, h::t) =>  koduj_h(pom(1, h, t)::list1)
      case _ => list1
    }
 koduj_h(Nil, list)
}


def pom[A](c:Int, s:A, list:List[A]):((Int, A),List[A])=
  list match
  {
  case (h::t) => if(h==s) pom(c+1, s, t)
  else ((c+1, s), t)
  case _ => ((c, s), list)
  }

TESTY:
koduj('a'::'a'::'a'::'a'::'a'::'a'::'b'::'b'::'b'::'b'::Nil)