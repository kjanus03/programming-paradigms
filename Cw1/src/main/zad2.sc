def count[A](x: A, xs: List[A]): Int = {
  if xs == Nil then 0
  else if xs.head == x then 1 + count(x, xs.tail)
  else count(x, xs.tail)
}

count('a', List('a', 'l', 'a'))