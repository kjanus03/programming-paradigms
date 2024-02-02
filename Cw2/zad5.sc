def initSegment[A](list1: List[A], list2: List[A]): Boolean =
  list1 match
    case Nil => true
    case hd::tl =>
      list2 match
        case Nil => false
        case hd2::tl2 => if hd2 == hd then initSegment(tl, tl2) else false



initSegment(List(1,2,3), List(1,2,3,4,5))
initSegment(List(1,2,3), List(1,2,4,5))