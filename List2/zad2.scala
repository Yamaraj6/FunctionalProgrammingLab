def polacz(list1:List[Int], list2:List[Int]):List[(Int,Int)]=
(list1,list2)match
{
  case(h1::t1,h2::t2)=>(h1,h2)::polacz(t1,t2)
  case(h1::t1,_)=>(h1,0)::polacz(t1,Nil)
  case(_,h2::t2)=>(0,h2)::polacz(Nil,t2)
  case _ =>Nil
  }

TESTY:
polacz(List.range(1,10),List.range(1,15))
polacz(List.range(1,15),List.range(1,10))
polacz(List.range(1,10,2),List.range(1,10,2))
polacz(List.range(1,20,2),List.range(1,60,3))