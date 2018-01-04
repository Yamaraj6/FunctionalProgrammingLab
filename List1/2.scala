def replikuj[T](element:T, reps:Int):List[T] = 
  if (reps < 0) throw new Exception("Negative reps")
  else if (reps == 0) Nil
  else element :: replikuj(element, reps-1)

  replikuj(4, 10)
  replikuj(3, 5)
  replikuj(9, 11)
