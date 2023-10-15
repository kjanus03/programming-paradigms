def sumProd(s: Int, e: Int): (Int, Int) = {
  if (s >= e){
    (0, 0)
  }
  else {
    val (sum, prod) = sumProd(s + 1, e)
    (s + sum, s * prod)
  }
}

sumProd(2, 4)