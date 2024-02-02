import scala.annotation.tailrec

def fib(n: Int): Int = {
  if (n < 2) n
  else fib(n - 1) + fib(n - 2)
}

def fibTail(n: Int): Int = {
  @tailrec
  def fibHelper(n: Int, accum: Int): Int = {
    if (n < 2) accum
    else fibHelper(n - 1, accum + fib(n - 2))
  }
  fibHelper(n, 0)
}

fibTail(42)
fib(42)


