sealed trait BT[+A]
case class Empty[A]() extends BT[A] 
case class Node[A](elem:A, left:BT[A], right:BT[A]) extends BT[A]

def lustro [A] (node: BT[A]): BT[A] =
node match 
{
	case Empty() => Empty()
	case Node(e, l, r) => Node(e, lustro(r), lustro(l))
}

TESTY:
val t = Node(1,Node(2,Empty[Int],Node(3,Empty[Int],Empty[Int])),Empty[Int]) 
val t = Node(1, Node(1, Node(9, Empty[Int], Empty[Int] ), Empty[Int] ), Node(3, Node(Empty[Int], Empty[Int], Node(8, Empty[Int], Empty[Int] ) ), Empty[Int] ) ) 
lustro(t)
