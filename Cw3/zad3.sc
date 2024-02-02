def sumProd(xs: List[Int]) : (Int, Int) =
  xs match
    case h::t =>
      val (sum, prod) = sumProd(t)
      (h + sum, h * prod)
    case Nil => (0, 1)

def sumProd2(xs:List[Int]): (Int, Int) =
  (xs foldLeft (0, 1))((sumProdResult, currHead) => (sumProdResult._1 + currHead, sumProdResult._2 * currHead))

sumProd2(List(1,2,3,4,5))