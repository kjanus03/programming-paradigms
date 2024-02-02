def sumProd(s: Int, e: Int): (Int, Int) = {
  if (s >= e) {
    (0, 1)
  } else {
    val (subSum, subProd) = sumProd(s + 1, e)
    (s + subSum, s * subProd)
  }
}

sumProd(1, 3)
sumProd(1, 4)
sumProd(4, 5)
sumProd(5, 5)
sumProd(5, 4)
sumProd(-2, 3)
sumProd(3, -2)