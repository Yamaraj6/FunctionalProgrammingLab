type 'a llist = LNil | LCons of 'a * (unit -> 'a llist);; 

let rec lparzyste k =
	if k mod 2 == 0 then LCons (k, function () -> lparzyste (k+2))
	else LCons (k+1, function () -> lparzyste (k+3));;

let rec ll = function 
	(0, _) -> [] 
	| (_, LNil) -> [] 
	| (n, LCons(x,y)) -> x::ll(n-1, y()) ;; 

lparzyste 12;;
ll (5,(lparzyste 0));;
ll (3, (lparzyste (7)));;
ll (2, (lparzyste (-50)));;