let dekoduj list = 
	let rec dekoduj_h (list1, tl) =
		match tl with
		| [] -> list1
		| (c,h)::t -> if c = 0 
		then dekoduj_h(list1@(h)::[], t)
		else dekoduj_h(list1@getlist(c,h,[]), t)
		in dekoduj_h([], list);;

	let rec getlist (c, h, list) =
		if c=0 then list
		else getlist(c-1, h, h::list);;

TESTY:
dekoduj((3,'a')::(4,'b')::[])