import scala.annotation.tailrec


def split3Rec[A](xs: List[A]): (List[A], List[A], List[A]) = {
  xs match
    case x ::y :: z :: tail =>
      val (a, b, c) = split3Rec(tail)
      (x :: a, y :: b, z :: c)
    case _ => (Nil, Nil, Nil)
}
split3Rec(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))


def split3Tail[A](xs: List[A]): (List[A], List[A], List[A]) =
  @tailrec
  def split3TailRec(xs:List[A], a: List[A], b: List[A], c: List[A]): (List[A], List[A], List[A]) =
    xs match
      case List(x) => (x :: a, b, c)
      case List(x, y) => (x :: a, y :: b, c)
      case x :: y :: z :: tail => split3TailRec(tail, x :: a, y :: b, z :: c)
      case _ => (a, b, c)
  split3TailRec(xs, Nil, Nil, Nil)

split3Tail(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
