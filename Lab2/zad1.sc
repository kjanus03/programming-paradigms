import scala.annotation.tailrec

def getByIndex[A](xs:List[A], i: Int): A =
  xs match
    case List() => throw new Exception("Index out of bounds")
    case h :: tail =>
      (i == 0) match
        case true => h
        case false => getByIndex(tail, i - 1)

def replaceAtIndex[A](xs: List[A], i: Int, x: A): List[A] =
  xs match
    case List() => throw new Exception("Index out of bounds")
    case h :: tail =>
      (i == 0) match
      case true => x :: tail
      case false => h :: replaceAtIndex(tail, i - 1, x)

def listLength[A](xs: List[A]): Int =
  xs match
    case List() => 0
    case h :: tail => 1 + listLength(tail)

def indexSwap[A](xs: List[A], a: Int, b: Int): List[A] =
  (a==b || listLength(xs) <= a || listLength(xs) <= b) match
    case true => xs
    case false =>
      (xs, a, b) match
        case (Nil, _, _) => Nil
        case (h :: tail, 0, _) => getByIndex(tail, b-1) :: replaceAtIndex(tail, b-1, h)
        case (h :: tail, _, 0) => getByIndex(tail, a-1) :: replaceAtIndex(tail, a-1, h)
        case (h :: tail, _, _) => h :: indexSwap(tail, a-1, b-1)


indexSwap(List(1, 2, 3, 4, 5), 2, 2)

