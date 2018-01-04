let rec podziel list = 
	match list with
	| []->([],[])
	| h::t ->let(xs1, xs2) =  podziel t in 
	if h mod 2 = 0 then ((h*h)::xs1,xs2)
	else (xs1, (h*3)::xs2);;

let podziel_tail list = 
	let rec podziel_h (list1, list2, tl) =
		match tl with
		| [] -> list1,list2
		| h::t -> if h mod 2 = 0 
		then podziel_h(list1@(h*h)::[], list2, t)
		else podziel_h(list1, (list2@(3*h)::[]), t)
		in podziel_h([],[], list);;
		
TESTY:
podziel(1::2::3::4::5::[]);;
podziel(9::9::9::1::2::2::2::[]);;
podziel [11;82;3;9];;
podziel [3;6;8;9;13];;
podziel_tail(1::2::3::4::5::[]);;
podziel_tail(9::9::9::1::2::2::2::[]);;
podziel_tail [11;82;3;9];;
podziel_tail [3;6;8;9;13];;