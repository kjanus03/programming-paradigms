def divisorSum(n: Int, i: Int=1, sum: Int=0): Int = {
  if i > n then sum
  else if n % i == 0 then divisorSum(n, i + 1, sum + i)
  else divisorSum(n, i + 1, sum)
}
def isPerfect(n: Int): Boolean = {
    if divisorSum(n)-n==n then true
    else false
}

isPerfect(6)
isPerfect(28)
isPerfect(496)

isPerfect(1)
isPerfect(2)
isPerfect(3)
