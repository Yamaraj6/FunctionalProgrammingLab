def podziel(list:List[Int]):(List[Int],List[Int],List[Int])=
  (list)match{
  case(x::li)=>
    if(x%10==1)
  {val (xs1, xs2, xs3)=podziel(li);(x::xs1, xs2, xs3)}
    else if(x%10==2)
  {val (xs1, xs2, xs3)=podziel(li);(xs1, x::xs2, xs3)}
    else
  {val (xs1, xs2, xs3)=podziel(li);(xs1, xs2, x+5::xs3)}
  case _ => (Nil,Nil,Nil)
}

TESTY:
podziel(0::11::22::33::Nil)
podziel(0::0::0::0::Nil)
podziel(List(1,2,33,12,129,12,19,0,0,91))
podziel(List.range(1, 100))
podziel(List.tabulate(5)(n=>2*n*n))