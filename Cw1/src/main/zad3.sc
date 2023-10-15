def replicate[A](x: A, n: Int): List[A] = {
  if n == 0 then Nil
  else List(x) ::: replicate(x, n-1)
}

replicate('a', 5)