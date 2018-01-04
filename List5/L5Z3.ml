type 'a bt = Empty | Node of 'a * 'a bt * 'a bt;;
let sum t =
	let rec sum_h(el, s, i) =
		match el with
		| [] -> if i!=0 then s/i else 0
		| Empty :: t -> sum_h(t, s, i)
		| Node(v, l, r) :: t -> sum_h (t @ (l :: r :: []), s+v, i+1)
		in sum_h([t], 0, 0)	;;
	
TESTY:
sum(Node(1,Node(2,Empty,Node(3,Empty,Empty)),Empty));;
sum(Node(5,Node(5,Empty,Node(5,Empty,Empty)),Empty));;
sum(Node(2,Empty,Empty));;
sum(Node(0,Empty,Empty));;
sum(Empty);;