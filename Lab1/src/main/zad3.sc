def isPerfect(n: Int): Boolean = {
  def ceil_sqrt(n: Int): Int = {
    def ceil_sqrt_helper(n: Int, guess: Int): Int = {
      if (n <= 0) then throw new Exception("n musi byc liczba naturalna dodatnia")
      if guess * guess >= n then guess
      else ceil_sqrt_helper(n, guess + 1)
    }

    ceil_sqrt_helper(n, 1)
  }

  def divisorSum(n: Int, i: Int, sum: Int): Int = {
    if i >= ceil_sqrt(n) then sum
    else if (n % i == 0) {
      val dzielnik1 = i
      val dzielnik2 = if (n / i == i) then 0 else n / i
      divisorSum(n, i + 1, sum + dzielnik1 + dzielnik2)
    }
    else divisorSum(n, i + 1, sum)
  }
    if divisorSum(n, 1, 0) - n == n then true
    else false
}

isPerfect(6)
isPerfect(28)
isPerfect(496)

isPerfect(1)
isPerfect(2)
isPerfect(3)
isPerfect(0)
isPerfect(2137)
isPerfect(-1)
