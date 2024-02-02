def getByIndex[A](xs:List[A], i: Int): A =
  xs match
    case List() => throw new Exception("Index out of bounds")
    case h :: tail => if i == 0 then h else getByIndex(tail, i - 1)

def replaceAtIndex[A](xs: List[A], i: Int, x: A): List[A] =
  xs match
    case List() => throw new Exception("Index out of bounds")
    case h :: tail => if i == 0 then x :: tail else h :: replaceAtIndex(tail, i - 1, x)

def swapIndex[A](xs: List[A], a: Int, b:Int): List[A] =
  xs match
    case Nil => Nil
    case hd :: tail => if a == 0
