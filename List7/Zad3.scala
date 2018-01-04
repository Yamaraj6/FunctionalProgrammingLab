def lzip[A,B](xs:Stream[A],ys:Stream[B]): Stream[(A,B)]=
(xs, ys) match {
case (h1#::t1, h2#::t2) => (h1,h2)#::lzip(t1,t2)
case _ => Stream.Empty
}

TESTY:
lzip(Stream(6,8,12), Stream('a','b','c', 'd')) force
lzip(Stream(1,2,3), Stream.Empty) force
lzip(Stream.Empty, Stream('a','b','c', 'd')) force
lzip(Stream.Empty, Stream.Empty) force