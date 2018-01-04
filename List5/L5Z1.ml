let filtruj(list, w)=
	let rec filtruj_h (list2, x, l)=
		match list2 with
		| h::t -> filtruj_h(t, h+x, l+1)
		| _ -> if l!=0 then x/l else 0
	in 
	let rec filtruj_g(list3, list4)=
		match list3 with
		| h::t ->
		if (filtruj_h(h, 0, 0)) == w
		then h::filtruj_g(t, list4)
		else filtruj_g(t, list4)
		| _ -> []
	in filtruj_g(list, []);;

TESTY:
filtruj((1::2::3::[])::(1::3::[])::(5::6::[])::[],2);;
filtruj((1::5::12::[])::(9::3::[])::(10::11::[])::[],6);;
filtruj((1::0::0::[])::(0::[])::([])::[],1);;