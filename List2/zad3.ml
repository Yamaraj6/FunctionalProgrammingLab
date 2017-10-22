let zamien(list, n) =
    let rec zamien_rec(i, acc) = function
      | [] -> List.rev acc
      | h :: t as l -> if i = 0 then l @ List.rev acc
                       else zamien_rec((i-1), (h :: acc)) t  in
    zamien_rec(n, []) list;;

TESTY:
zamien(1::7::5::6::[],2);;
zamien(1::7::5::6::12::15::54::27::[], 5);;
zamien([5;63;73;23;124;2],0);;
zamien(['a';'b';'c'],-2);;
zamien(['a';'b';'c';'d';'e';'f'],2);;