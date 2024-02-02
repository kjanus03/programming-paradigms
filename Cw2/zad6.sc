def replceNth[A](list: List[A], n: Int, value:A): List[A] =
  def replaceIter(list: List[A], n: Int, value: A, index: Int): List[A] =
    list match
      case Nil => Nil
      case hd :: tl =>
        if index - n == 0 then value :: replaceIter(tl, n, value, index + 1)
        else hd :: replaceIter(tl, n, value, index + 1)

  replaceIter(list, n, value, 0)

replceNth(List(1,2,3,4,5,6,7,8,9), 3, 0)