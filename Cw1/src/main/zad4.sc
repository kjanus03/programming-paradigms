def sqrList(xs: List[Int]): List[Int] = {
  if xs == Nil then Nil
  else List(xs.head * xs.head) ::: sqrList(xs.tail)
}

sqrList(List(1, 2, 3, -4))

val sqrList2 = (xs: List[Int]) => {
  if xs == Nil then Nil
  else List(xs.head * xs.head) ::: sqrList(xs.tail)
}

sqrList2(List(1, 2, 3, -4))