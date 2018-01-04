let fun_kwad (el) = el*.el;;
let rec przeksztalc (list, func) = 
if list=[] then []
else func(List.hd list) :: przeksztalc(List.tl list, func) ;;

fun_kwad(2.);;
fun_kwad(8.1);;
fun_kwad(10.4);;
przeksztalc ([1.;3.;4.], fun_kwad);;
przeksztalc ([7.12;3.44;4.7], fun_kwad);;
przeksztalc ([9.;3.45;5.1], fun_kwad);;