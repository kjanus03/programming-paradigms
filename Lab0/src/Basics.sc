"Hello, World"
res0 + "!"

val x = 7
x = 13

val x = 13
2.5 + 4.1

// tworzenie funkcji
val f = (x:Double) => x*x+1
f(10)

// tworzenie metody
def f(x: Double) = x*x+1

def g(x:Double, y:Double) = x*x + y*y
g(10, 2)

val g = (x:Double, y:Double) => x*x + y*y
g(5, 5)

def g(xy: (Double, Double)) = xy._1*xy._1 + xy._2*xy._2
g((1.0, 1.0))

// ify jak operator tetralny w javie (tf)
def h(x:Double, y:Double) =
  {
    val sum = x+y
    if (x<y)
    {
      sum
    }
    else if (x==y){
      0
    }
    else {
      -sum
    }
  }

  h(20, 20)


// fukcja dzialaja dla wielu typow -> polimorficzna
def f2[T](x:T, y:Double) = y
f2(10, 10.2)
f2("Hello", 1.2)
f2(10.3, 2.3)





