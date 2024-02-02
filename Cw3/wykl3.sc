// rozwijanie i zwijanie funkcji
val plus = (x: Int, y:Int) => x+y
(plus curried 4)(5)

val add = (x: Int) => (y: Int) => x+y
Function.uncurried(add)(4, 5)


import scala.language.postfixOps
plus curried

// skladanie funkcji
val sqr = (n: Int) => n*n
(((n: Int) => 2*n) compose sqr)(3)
(((n: Int) => 2*n) andThen sqr)(3)

// generowanie liczb pierwszych metoda sita eratostenesa

val primes = (toN: Int) => {
  def findPrimes(sieve: List[Int ]): List[Int] = {
    sieve match {
      case h :: t => h :: findPrimes(t filter (x => x % h != 0))
      case Nil => Nil
    }
  }
  findPrimes(List.range(2, toN))
}
primes(30)

// funckjonaly dla list

def insert[A](poprzedza: A => A => Boolean)(elem: A)(xs: List[A]): List[A] =
  xs match
    case Nil => elem::Nil
    case y::ys => if (poprzedza (elem) (y)) then elem::xs else y::insert(poprzedza)(elem)(ys)

insert((x: Int) => (y: Int) => x < y)(3)(List(1,2,4,5))

List(1,2,3,4) map(x => x*x)
List(1,2,3,4) filter(x => x%2 !=0)

// fold_left i fold_right

(List(1,2,3,4) foldLeft 0)((sum, x)=> sum+x)
(List(1,2,3,4) foldLeft 1)((prod, x) => prod*x)

((List(List(1, 2, 3, 4), List(5, 6, 7))) map (x => x.tail)).flatten
List(List(1, 2, 3, 4), List(5, 6, 7)).flatMap(x => x.tail)
